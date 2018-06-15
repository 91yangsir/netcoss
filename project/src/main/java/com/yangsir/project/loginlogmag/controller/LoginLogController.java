package com.yangsir.project.loginlogmag.controller;

import com.yangsir.project.loginlogmag.queryservice.ILoginLogQueryService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.beans.Pager;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 * 登陆日志控制层
 */
@RestController
@RequestMapping("/loginlog")
public class LoginLogController {

	@Resource
	public ILoginLogQueryService loginLogQueryServiceImpl;

	@RequestMapping(value="/get",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findLoginLog2Pager(Pager pager,String manager,Date startTime,Date endTime) {
		Map<String, Object> params = new HashMap<>();
		params.put("manager", manager);
		params.put("startTime", startTime);
		params.put("endTime", endTime);
		loginLogQueryServiceImpl.findLoginLogByParams2Pager(params, pager);
		return pager;
	}
}