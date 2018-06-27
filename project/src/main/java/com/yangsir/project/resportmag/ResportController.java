package com.yangsir.project.resportmag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.billmag.mapper.BillMapper;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;
import com.yangsir.project.viewobject.EchartData;
import com.yangsir.project.viewobject.Series;

@RequestMapping("/report")
@RestController
public class ResportController {

	@Resource
	private BillMapper billMapper;
	@Resource
	private IUserQueryRepository userQueryRepositoryImpl;
	@Resource
	private IAccountingQueryRepository accountingQueryRepositoryImpl;

	@RequestMapping(value = "/getYearBill", method = { RequestMethod.GET }, produces = {
			"application/json;charset=utf-8" })
	public EchartData getYearBill(String year, String userAcc) {
		Map<String, Object> params = new HashMap<>();
		params.put("userAcc", userAcc);
		params.put("year", year);
		List<BillBean> bills = billMapper.findByParam(params);
		List<String> legend = new ArrayList<String>();
		List<Map> serisData = new ArrayList<Map>();

		for (BillBean bill : bills) {
			Map map = new HashMap();
			legend.add(bill.getBillMonth() + "月");
			map.put("value", bill.getBillMoney());
			map.put("name", bill.getBillMonth() + "月");
			serisData.add(map);
		}

		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("账单报表", "pie", serisData));
		EchartData data = new EchartData(legend, null, series);
		return data;
	}

//	@RequestMapping(value = "/getEveryBusinessBill", method = { RequestMethod.GET }, produces = {
//			"application/json;charset=utf-8" })
//	public EchartData getYearbusinessBill(String year, String userAcc) {
//		Map<String, Object> params = new HashMap<>();
//		Set<String> business = new HashSet<>();
//
//		UserBean user = userQueryRepositoryImpl.getUserByAcc(userAcc);
//		for (BusinessBean bus : user.getBusiness()) {
//			business.add(bus.getBusinessAcc());
//		}
//
//		params.put("business", business);
//		params.put("month", year);
//		// 得到了账务帐号下每个业务账号的费用
//		List<MonthUseBean> monthUses = accountingQueryRepositoryImpl.findDuratingOfMonthByParams(params);
//
//		// 封装报表数据
//		Set<String> category = new HashSet<>();
//		List<Long> serisData = new ArrayList<Long>();
//		List<String> legend = new ArrayList<String>();// 数据分组
//
//		for (BusinessBean bus : user.getBusiness()) {
//			legend.add(bus.getBusinessAcc());
//		}
//		
//		for (MonthUseBean monthUse : monthUses) {
//			category.add(monthUse.getMonth());
//		}
//		List<String> categoryList = new ArrayList<>(category);
//		
//		
//		
//		
//		
//		
//		
//		List<Series> series = new ArrayList<Series>();// 纵坐标
//		series.add(new Series("账单报表", "line", serisData));
//		EchartData data = new EchartData(legend, categoryList, series);
//		return data;
//	}

}
