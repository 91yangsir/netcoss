package com.yangsir.project.costmag.controller;

import java.util.List;

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
	
	
	@RequestMapping(value="/page",method= {RequestMethod.GET},produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public DataGrid showCostToPager(Pager pager) {
		System.out.println(11111);
		//Pager p = costQueryServiceImpl.findAllCostBean(pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}
}