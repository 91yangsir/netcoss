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
@RequestMapping(value = "/cost")
@Controller
public class CostController {

	@Resource
	public ICostHandleService costHandleServiceImpl;

	@Resource
	public ICostQueryService costQueryServiceImpl;

	// 查询所有的资费
	@ResponseBody
	@RequestMapping(value = "/findAll", method = { RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	public DataGrid showCostToPager(Pager pager) {
		costQueryServiceImpl.findAllCostBean(pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}

	// 添加资费
	@ResponseBody
	@RequestMapping(value = "/save", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public void saveCostBean(String costName, int costType, int costTime, double costBase, double costUnit,
			String costExplain) {
		System.out.println("进入添加资费controller");
		CostBean bean = new CostBean();
		bean.setCostName(costName);
		bean.setCostType(costType);
		bean.setCostTime(costTime);
		bean.setCostBase(costBase);
		bean.setCostUnit(costUnit);
		bean.setCostExplain(costExplain);
		CostBean cost = costHandleServiceImpl.saveCostBean(bean);
	}

	// 修改资费
	@ResponseBody
	@RequestMapping(value = "/update", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public boolean updateCostBean(long id, String costName, int costType, int costTime, double costBase,
			double costUnit, String costExplain) throws UnsupportedEncodingException {
		System.out.println("进入修改资费controller");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		int num = costQueryServiceImpl.getCostBeanByBusinessBeanNums(id);
		System.out.println("当前有" + num + "个用户使用此资费");
		if (num == 0) {
			bean.setCostName(costName);
			bean.setCostType(costType);
			bean.setCostTime(costTime);
			bean.setCostBase(costBase);
			bean.setCostUnit(costUnit);
			bean.setCostExplain(costExplain);
			costHandleServiceImpl.updateCostBean(bean);
			return true;
		} else {
			return false;
		}
	}

	// 修改资费的状态为暂停
	@ResponseBody
	@RequestMapping(value = "/updateout", method = { RequestMethod.POST })
	public boolean updateStateOut(long id) {
		System.out.println("进入修改资费状态为暂停");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		int num = costQueryServiceImpl.getCostBeanByBusinessBeanNums(id);
		System.out.println("当前有" + num + "个用户使用此资费");
		if (num == 0) {
			costHandleServiceImpl.updateCostStateOut(bean);
			return true;
		} else {
			return false;
		}
	}

	// 修改资费状态为开通
	@ResponseBody
	@RequestMapping(value = "/updateopen", method = { RequestMethod.POST })
	public int updateStateOpen(long id) {
		System.out.println("进入修改资费状态为开通");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		System.out.println("当前资费开通时间为"+bean.getCostStart());
		if (bean.getCostStart() == null) {
			costHandleServiceImpl.updateCostStateStart(bean);
			return 1;
		} else {
			return 0;
		}
	}

	// 删除资费
	@ResponseBody
	@RequestMapping(value = "/delete", method = { RequestMethod.POST })
	public boolean deleteCostBean(long id) {
		System.out.println("进入删除资费页面");
		CostBean bean = costQueryServiceImpl.getCostBeanById(id);
		int num = costQueryServiceImpl.getCostBeanByBusinessBeanNums(id);
		System.out.println("当前已有" + num + "个用户使用此资费");
		if (num == 0) {
			costHandleServiceImpl.deleteCostBean(bean);
			return true;
		} else {
			return false;
		}
	}
}