package com.yangsir.project.accountingmag.queryrepository.impl;

import java.util.List;

import com.yangsir.project.accountingmag.mapper.AccountingMapper;
import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:34
 */
public class AccountingQueryRepository implements IAccountingQueryRepository {

	public AccountingMapper m_AccountingMapper;

	public AccountingQueryRepository(){

	}

	public void finalize() throws Throwable {

	}

	public int countAllDuratingOfMonth(){
		return 0;
	}

	public List findAllDuratingOfMonth(){
		return null;
	}

}