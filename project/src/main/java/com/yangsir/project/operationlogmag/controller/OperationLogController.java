package com.yangsir.project.operationlogmag.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.operationlogmag.queryservice.IOperationLogQueryService;
import com.yangsir.project.viewobject.DataGrid;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 操作日志控制层
 */
@RequestMapping("/operationlog")
@Controller
public class OperationLogController {

	@Resource
	public IOperationLogQueryService operationLogQueryServiceImpl;

	
	@RequestMapping(value="/getOperationLog",method= {RequestMethod.GET})
	public ModelAndView getpage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("operationlogmag/operationlog");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/getOperationLogPager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public DataGrid findOperationLog2Pager(Pager pager,String manager,int type,int model,Date startTime,Date endTime) {
		Map<String, Object> params = new HashMap<>();
		params.put("manager", manager);
		params.put("type", type);
		params.put("model", model);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = "";
		String endDate = "";
		if (startTime!=null) {
			startDate = sdf.format(startTime);
		}
		
		params.put("startTime", startDate);

		if (endTime!=null) {
			//由于页面得到的日期是当天0点，在查询时应该是当天最后一刻，所以使用日历类加一天在转换回来
			Calendar c = new GregorianCalendar();
			c.setTime(endTime);  
			c.add(Calendar.DAY_OF_MONTH, 1);
			endTime = c.getTime();
			endDate = sdf.format(endTime);
		}
		params.put("endTime", endDate);
		operationLogQueryServiceImpl.findOperationLogByParams2Pager(params, pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		System.out.println(dataGrid);
		return dataGrid;
	}
}