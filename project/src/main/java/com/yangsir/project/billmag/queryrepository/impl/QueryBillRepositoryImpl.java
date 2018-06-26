package com.yangsir.project.billmag.queryrepository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.MonthUseBean;
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
	@Override
	public List<BillBean> findAll() {
		// TODO Auto-generated method stub
		return billMapper.findAll();
	}
	@Override
	public List<BillBean> findByPage(int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		List<BillBean> list= billMapper.findAll();
		return list;
	}
	@Override
	public List<MonthUseBean> findByPage1(int page, int rows, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
