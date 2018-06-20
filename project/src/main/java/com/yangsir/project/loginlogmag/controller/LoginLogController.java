package com.yangsir.project.loginlogmag.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.loginlogmag.queryservice.ILoginLogQueryService;
import com.yangsir.project.viewobject.DataGrid;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 * 登陆日志控制层
 */
@Controller
@RequestMapping("/loginlog")
public class LoginLogController {

	@Resource
	public ILoginLogQueryService loginLogQueryServiceImpl;
	
	@RequestMapping(value="/getLoginLog",method= {RequestMethod.GET})
	public ModelAndView getpage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginlogmag/loginlog");
		return mv;
	}

	@ResponseBody
	@RequestMapping(value="/getLoginLogPager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public DataGrid findLoginLog2Pager(int page,int rows,String manager,int type,Date startTime,Date endTime) {
		Pager pager = new Pager(page,rows);
		Map<String, Object> params = new HashMap<>();
		params.put("manager", null);
		params.put("startTime", null);
		params.put("endTime", null);
		params.put("type", null);
		loginLogQueryServiceImpl.findLoginLogByParams2Pager(params, pager);
		System.out.println(pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}
}