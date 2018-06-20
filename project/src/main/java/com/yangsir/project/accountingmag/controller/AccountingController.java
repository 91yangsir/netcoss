package com.yangsir.project.accountingmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.accountingmag.queryservice.IAccountingQueryService;
import com.yangsir.project.beans.Pager;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:34
 * 账务查询控制层
 */
@RequestMapping("/accounting")
@Controller
public class AccountingController {

	@Resource
	public IAccountingQueryService accountingQueryServiceImpl;
	
	//内部转发到账务查询页面
	@RequestMapping(value="/getPage",method= {RequestMethod.GET})
	public ModelAndView get() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("accountingmag/accounting");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/getYearUsePager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findYearUse2Pager(Pager pager,String accounting,String year) {
		Map<String, Object> params = new HashMap<>();
		params.put("accounting", accounting);
		params.put("year", year);
		accountingQueryServiceImpl.findAllDuratingOfYear2pager(params, pager);
		return pager;
	}
	
	@ResponseBody
	@RequestMapping(value="/getMonthUsePager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findMonthUse2Pager(Pager pager,String accounting,String business,String month) {
		Map<String, Object> params = new HashMap<>();
		params.put("accounting", accounting);
		params.put("month", month);
		params.put("business", business);
		accountingQueryServiceImpl.findAllDuratingOfMonth2pager(params, pager);
		return pager;
	}
	
	@ResponseBody
	@RequestMapping(value="/getDayUsePager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findDayUse2Pager(Pager pager,String business) {
		Map<String, Object> params = new HashMap<>();
		params.put("business", business);
		accountingQueryServiceImpl.findAllDuratingOfDay2pager(params, pager);
		return pager;
	}
}