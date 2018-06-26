package com.yangsir.project.billmag.queryrepository;

import java.util.List;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.TimeUseBean;

public interface IQueryBillRepostiory {

	public TimeUseBean getMaxUseTimeBill(String account);
	
	public List<BillBean> findAll();
	
	public List<BillBean> findByPage(int page,int rows);
	
	public List<MonthUseBean> findByPage1(int page,int rows,int id);
}
