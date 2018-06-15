package com.yangsir.project.billmag.queryrepository.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.TimeUseBean;
import com.yangsir.project.billmag.mapper.BillMapper;
import com.yangsir.project.billmag.queryrepository.IQueryBillRepostiory;
@Repository
public class QueryBillRepositoryImpl implements IQueryBillRepostiory  {
	@Resource
	private BillMapper billMapper;
	@Override
	public TimeUseBean getMaxUseTimeBill(String account) {
		// TODO Auto-generated method stub
		return billMapper.getMaxUseTimeBill(account);
	}

}
