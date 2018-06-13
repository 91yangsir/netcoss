package com.yangsir.project.accountingmag.queryservice.impl;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.accountingmag.queryservice.IAccountingQueryService;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:34
 */
public class AccountingQueryServiceImpl implements IAccountingQueryService {

	public IAccountingQueryRepository m_IAccountingQueryRepository;

	public AccountingQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	public Pager findAllDuratingOfMonth2pager(){
		return null;
	}

}