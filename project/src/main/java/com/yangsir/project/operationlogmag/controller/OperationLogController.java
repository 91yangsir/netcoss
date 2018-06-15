package com.yangsir.project.operationlogmag.controller;

import com.yangsir.project.operationlogmag.queryservice.IOperationLogQueryService;
import com.yangsir.project.operationlogmag.handleService.IOperationLogHandleService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.beans.Pager;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 操作日志控制层
 */
@RestController
@RequestMapping("/operationlog")
public class OperationLogController {

	@Resource
	public IOperationLogQueryService operationLogQueryServiceImpl;

	@RequestMapping(value="/get",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findOperationLog2Pager(Pager pager,String manager,Integer type,Integer model,Date startTime,Date endTime) {
		Map<String, Object> params = new HashMap<>();
		params.put("manager", manager);
		params.put("type", type);
		params.put("model", model);
		params.put("startTime", startTime);
		params.put("endTime", endTime);
		operationLogQueryServiceImpl.findOperationLogByParams2Pager(params, pager);
		return pager;
	}
}