package com.operationlog.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.operationlogmag.handleService.IOperationLogHandleService;
import com.yangsir.project.operationlogmag.queryservice.IOperationLogQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class OperationLogTest {

	@Resource
	private IOperationLogHandleService operationLogHandleServiceImpl;
	@Resource
	private IOperationLogQueryService operationLogQueryServiceImpl;
	
	
	
	@Test
	public void findOperationLog2Pager() {
		Map<String, Object> params = new HashMap<>();
		Pager pager = new Pager(1,10);
		params.put("manager", "x");
		params.put("type", 0);
		params.put("model", 0);
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		operationLogQueryServiceImpl.findOperationLogByParams2Pager(params, pager);
		System.out.println(pager);
	}
	
	@Test
	public void saveOperationLog() {
		OperationLogBean operationLog = new OperationLogBean();
		operationLog.setManagerName("xx");
		operationLog.setOperationLogData("修改了xxxx");
		operationLog.setOperationLogModel(0);
		operationLog.setOperationLogTime(new Date());
		operationLog.setOperationLogType(0);
		operationLogHandleServiceImpl.saveOperationLog(operationLog);
	}
	
}
