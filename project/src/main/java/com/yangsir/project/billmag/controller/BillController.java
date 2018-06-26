package com.yangsir.project.billmag.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yangsir.project.accountingmag.mapper.AccountingMapper;
import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.TimeUseBean;
import com.yangsir.project.billmag.handleservcie.IHandleBillService;
import com.yangsir.project.billmag.mapper.BillMapper;
import com.yangsir.project.billmag.queryservcie.IQueryBillService;
import com.yangsir.project.businessmag.mapper.BusinessMapper;
import com.yangsir.project.utils.BillUtil;
import com.yangsir.project.viewobject.DataGrid;

@RestController
@RequestMapping("/bill")
public class BillController {
	@Resource
	private IHandleBillService handleBillServiceimpl;
	@Resource
	private IQueryBillService queryBillServiceImpl;
	@Resource
	private BillMapper billMapper;
	@Resource
	private BusinessMapper bussinessMapper;
	@Resource
	private AccountingMapper accountMapper;

	@RequestMapping(value = "/get", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public DataGrid findAllRole(int page, int rows) {
		List<BillBean> list = queryBillServiceImpl.findByPage(page, rows);
		List<BillUtil> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			BillUtil bean = new BillUtil();
			bean.setId(list.get(i).getId());
			bean.setAccount(list.get(i).getUser().getUserAcc());
			bean.setIdCard(list.get(i).getUser().getUserCard());
			bean.setYear(list.get(i).getBillYear() + "");
			bean.setMonth(list.get(i).getBillMonth() + "");
			bean.setCostMoney(list.get(i).getBillMoney());
			if (list.get(i).getBillType() == 1) {
				bean.setPayType("微信");
			} else if (list.get(i).getBillType() == 2) {
				bean.setPayType("支付宝");
			} else {
				bean.setPayType("银联");
			}
			if (list.get(i).getBillState() == 0) {
				bean.setPayState("未支付");
			} else {
				bean.setPayState("已支付");
			}
			list1.add(bean);

		}
		DataGrid data = new DataGrid((long) queryBillServiceImpl.findAll().size(), list1);
//		System.out.println(data);
		return data;
	}

	@RequestMapping(value = "/get1", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public DataGrid findAllBusiness(int page, int rows, int id,String month) {
//		System.out.println(month);
//		System.out.println(id);
		int userId = billMapper.findUserId(id);
//		System.out.println(userId);
		Set<BusinessBean> set = bussinessMapper.getBusinessByUserId((long) userId);
//		System.out.println(set);
		List<MonthUseBean> list = new ArrayList<>();
		Iterator<BusinessBean> it = set.iterator();
		while (it.hasNext()) {
			BusinessBean bean = it.next();
			MonthUseBean monthBean = accountMapper.findByBusAcc(bean.getBusinessAcc(),month);
			if(monthBean!=null) {
				list.add(monthBean);
			}
			
		}
		
//		System.out.println(list);
		 DataGrid data = new DataGrid((long)(list.size()),list);
		 
//		 System.out.println(data);
		 return data;
	}
	
	@RequestMapping(value = "/get2", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public DataGrid findTimeUseByPage(int rows,int page,String acc,String month) {
//	PageHelper.startPage(page, rows);
	List<TimeUseBean> list=	billMapper.findByPage(acc, month);
	System.out.println(list);
	DataGrid data = new DataGrid((long) list.size(), list);
	return data;
		
		
	}
}
