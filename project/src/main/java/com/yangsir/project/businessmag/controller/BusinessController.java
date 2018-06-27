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
import com.yangsir.project.beans.ServerBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.businessmag.handleservice.IBusinessHandleService;
import com.yangsir.project.businessmag.queryservice.IBusinessQueryService;
import com.yangsir.project.costmag.mapper.CostMapper;
import com.yangsir.project.costmag.queryservice.ICostQueryService;
import com.yangsir.project.servermag.mapper.ServerMapper;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;
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
	private IBusinessHandleService businessHandleServiceImpl;
	@Resource
	private IBusinessQueryService businessQueryServiceImpl;
	@Resource
	private ICostQueryService costQueryServiceImpl;
	@Resource
	private IUserQueryRepository userQueryRepositoryImpl;
	@Resource
	private CostMapper costMapper;
	@Resource
	private ServerMapper serverMapper;
	
	/**
	 * 添加业务帐号
	 * @param business
	 * @return
	 */
	@RequestMapping(value="/save",method= {RequestMethod.POST}, produces = {
	"application/json;charset=utf-8" })
	public String saveBusiness(BusinessBean business,Long userId,Long costId,Long serverId) {
		try {
			UserBean user = new UserBean();
			user.setId(userQueryRepositoryImpl.getUserById(userId).getId());
			System.out.println(userId);
			CostBean cost = new CostBean();
			cost.setId(costMapper.getCostBeanById(costId).getId());
			ServerBean server = new ServerBean();
			server.setId(serverMapper.getSeverById(serverId).getId());
			business.setUser(user);
			business.setCost(cost);
			business.setServer(server);
			
			businessHandleServiceImpl.saveBusiness(business);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/view/businessmag/showbusiness.ftl";
	}
	
	/**
	 * 分页显示业务信息
	 * @param pager
	 * @param userAcc
	 * @param businessAcc
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/showPage",method= {RequestMethod.GET},produces = { 
			"application/json;charset=utf-8" })
	public DataGrid findBusiness2Page(Pager pager,String userAcc,String businessAcc) {
		Map params = new HashMap();
		params.put("userAcc", userAcc);
		params.put("businessAcc", businessAcc);
		try {
			pager = businessQueryServiceImpl.findBusiness2PageByMap(params, pager);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		System.out.println(pager);
		DataGrid dataGrid = new DataGrid((long)pager.getTotalRows(),pager.getDatas());
		return dataGrid;
	}
	
	
	/**
	 * 删除业务帐号
	 * @param business
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/delete",method= {RequestMethod.DELETE})
	public String deleteBusiness(BusinessBean business) {
		
		try {
			businessHandleServiceImpl.deleteBusiness(business);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "";
	}
	
	
	/**
	 * 查询显示cost下拉框
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/costCombobox",method= {RequestMethod.GET},produces = { 
	"application/json;charset=utf-8" })
	public List<CostBean> queryAllCost() {
		
		List<CostBean> datas = costQueryServiceImpl.getFindAllCostBean();
		
		return datas;
	}
	
	
}
