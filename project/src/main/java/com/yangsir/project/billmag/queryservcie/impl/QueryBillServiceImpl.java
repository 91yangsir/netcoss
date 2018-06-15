package com.yangsir.project.billmag.queryservcie.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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

	

}
