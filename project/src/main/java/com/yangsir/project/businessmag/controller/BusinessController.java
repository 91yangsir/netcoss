package com.yangsir.project.businessmag.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.businessmag.handleservice.IBusinessHandleService;
import com.yangsir.project.businessmag.queryservice.IBusinessQueryService;
import com.yangsir.project.costmag.queryservice.ICostQueryService;
import com.yangsir.project.viewobject.DataGrid;

/**
 * 
 * @author dl
 *
 */
@RequestMapping("/business")
@Controller
public class BusinessController {

	@Resource
	private IBusinessHandleService businessHandleService;
	@Resource
	private IBusinessQueryService businessQueryService;
	
	@Resource
	public ICostQueryService costQueryServiceImpl;
	
	/**
	 * 添加业务帐号
	 * @param business
	 * @return
	 */
	@RequestMapping(value="/save",method= {RequestMethod.POST}, produces = {
	"application/json;charset=utf-8" })
	public String saveBusiness(BusinessBean business) {
		try {
			businessHandleService.saveBusiness(business);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/view/businessmag/showbusiness.ftl";
	}
	
	@ResponseBody
	@RequestMapping(value="/showPage",method= {RequestMethod.GET},produces = { 
			"application/json;charset=utf-8" })
	public DataGrid findBusiness2Page(Pager pager,String userAcc,String businessAcc) {
		Map params = new HashMap();
		params.put("userAcc", userAcc);
		params.put("businessAcc", businessAcc);
		try {
			pager = businessQueryService.findBusiness2PageByMap(params, pager);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(pager);
		DataGrid dataGrid = new DataGrid((long)pager.getTotalRows(),pager.getDatas());
		return dataGrid;
	}
	
	@ResponseBody
	@RequestMapping(value="/costCombobox",method= {RequestMethod.GET},produces = { 
	"application/json;charset=utf-8" })
	public List<CostBean> queryAllCost() {
		
		List<CostBean> datas = costQueryServiceImpl.getFindAllCostBean();
		
		return datas;
	}
	
	
}
