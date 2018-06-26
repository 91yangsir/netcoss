package com.yangsir.project.billmag.queryservcie.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.TimeUseBean;
import com.yangsir.project.billmag.queryrepository.IQueryBillRepostiory;
import com.yangsir.project.billmag.queryservcie.IQueryBillService;
@Service
public class QueryBillServiceImpl implements IQueryBillService {
	@Resource
	private IQueryBillRepostiory  queryBillRepostioryImpl; 
	@Override
	public TimeUseBean getMaxUseTimeBill(String account) {
		// TODO Auto-generated method stub
		return queryBillRepostioryImpl.getMaxUseTimeBill(account);
		
	}
	@Override
	public List<BillBean> findAll() {
		// TODO Auto-generated method stub
		return queryBillRepostioryImpl.findAll();
	}
	@Override
	public List<BillBean> findByPage(int page, int rows) {
		// TODO Auto-generated method stub
		return queryBillRepostioryImpl.findByPage(page, rows);
	}
	@Override
	public List<MonthUseBean> findByPage1(int page, int rows, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
