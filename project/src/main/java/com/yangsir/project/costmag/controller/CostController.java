package com.yangsir.project.costmag.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.costmag.handleservice.ICostHandleService;
import com.yangsir.project.costmag.queryservice.ICostQueryService;
import com.yangsir.project.viewobject.DataGrid;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
@RequestMapping(value="/cost")
@Controller
public class CostController {

	@Resource
	public ICostHandleService costHandleServiceImpl;
	
	@Resource
	public ICostQueryService costQueryServiceImpl;
	
	//查询所有的资费
	@ResponseBody
	@RequestMapping(value="/findAll",method= {RequestMethod.GET},produces= {"application/json;charset=utf-8"})
	public DataGrid showCostToPager(Pager pager) {
		costQueryServiceImpl.findAllCostBean(pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}
	
	//添加资费
	@ResponseBody
	@RequestMapping(value="/save",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public void saveCostBean(String costName,int costType,int costTime,double costBase,double costUnit,String costExplain) {
		System.out.println(22222);
		CostBean bean = new CostBean();
		bean.setCostName(costName);
		bean.setCostType(costType);
		bean.setCostTime(costTime);
		bean.setCostBase(costBase);
		bean.setCostUnit(costUnit);
		bean.setCostExplain(costExplain);
		CostBean cost = costHandleServiceImpl.saveCostBean(bean);
	}
	
	
	
	//修改资费
	@ResponseBody
	@RequestMapping(value="/update",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public void updateCostBean(long id,String costName,int costType,int costTime,double costBase,double costUnit,String costExplain) throws UnsupportedEncodingException {
		System.out.println("进入修改资费controller");
		System.out.println(costName);
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		bean.setCostName(new String(costName.getBytes("iso8859-1"),"utf-8"));
		bean.setCostType(costType);
		bean.setCostTime(costTime);
		bean.setCostBase(costBase);
		bean.setCostUnit(costUnit);
		bean.setCostExplain(costExplain);
		costHandleServiceImpl.updateCostBean(bean);
	}
	
	//修改资费的状态为暂停
	@ResponseBody
	@RequestMapping(value="/updateout",method= {RequestMethod.POST})
	public void updateStateOut(long id) {
		System.out.println("进入修改资费状态为暂停");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		costHandleServiceImpl.updateCostStateOut(bean);
	}
	
	//修改资费状态为开通
	@ResponseBody
	@RequestMapping(value="/updateopen",method= {RequestMethod.POST})
	public void updateStateOpen(long id) {
		System.out.println("进入修改资费状态为开通");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		costHandleServiceImpl.updateCostStateStart(bean);
	}
	
	
	//删除资费
	@ResponseBody
	@RequestMapping(value="/delete",method= {RequestMethod.POST})
	public void deleteCostBean(long id) {
		System.out.println("进入删除资费页面");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		costHandleServiceImpl.deleteCostBean(bean);
	}
}