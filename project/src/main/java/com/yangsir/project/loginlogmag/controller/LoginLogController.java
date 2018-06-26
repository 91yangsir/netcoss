package com.yangsir.project.loginlogmag.controller;

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
	
	/**
	 * 跳转到登陆日志页面
	 * @return
	 */
	@RequestMapping(value="/getLoginLog",method= {RequestMethod.GET})
	public ModelAndView getpage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginlogmag/loginlog");
		return mv;
	}

	/**
	 * 得到登陆日志分页数据
	 * @param pager 分页信息
	 * @param manager 管理员
	 * @param type 操作类型
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @return 分页展示数据
	 */
	@ResponseBody
	@RequestMapping(value="/getLoginLogPager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public DataGrid findLoginLog2Pager(Pager pager,String manager,int type,Date startTime,Date endTime) {
		Map<String, Object> params = new HashMap<>();
		params.put("manager", manager);
		
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
		params.put("type", type);
		loginLogQueryServiceImpl.findLoginLogByParams2Pager(params, pager);
		System.out.println(pager);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}
}