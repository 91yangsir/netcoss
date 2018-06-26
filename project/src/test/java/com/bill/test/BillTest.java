package com.bill.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.billmag.handleservcie.IHandleBillService;
import com.yangsir.project.billmag.queryservcie.IQueryBillService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class BillTest {
	@Resource
	private IHandleBillService handleBillServiceimpl; 
	@Resource
	private IQueryBillService queryBillServiceImpl; 
	@Test
	public void addBill() throws ParseException {
		ServerInfoBean bean=new ServerInfoBean();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date date=sdf.parse("2008-08-08 13:00:00");
		Date date1=sdf.parse("2008-08-08 14:00:00");
		bean.setServerInTime(date);
		bean.setServerOutTime(date1);
		bean.setServerUseTime(3600l);
		bean.setServerIp("127.168.1.1");
		bean.setBussinesAcc("guosir");
		handleBillServiceimpl.addOnceBill(bean);
		
	}
	@Test
	public void getMaxUseTimeBill() {
		
		System.out.println(queryBillServiceImpl.getMaxUseTimeBill("guosir"));
	}
	
	@Test
	public void findAll() {
		
		System.out.println(queryBillServiceImpl.findAll());
	}
	
	@Test
	public void findAllPage() {
		
		System.out.println(queryBillServiceImpl.findByPage(1, 5));
	}

}
