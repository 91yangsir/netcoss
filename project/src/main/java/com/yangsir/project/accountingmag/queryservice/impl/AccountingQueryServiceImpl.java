package com.yangsir.project.accountingmag.queryservice.impl;

import com.yangsir.project.beans.Pager;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.accountingmag.queryservice.IAccountingQueryService;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:34
 * 账务查询业务层
 */
@Service
public class AccountingQueryServiceImpl implements IAccountingQueryService {

	@Resource
	public IAccountingQueryRepository accountingQueryRepositoryImpl;

	@Override
	public Pager findAllDuratingOfMonth2pager(Map params, Pager pager) {
		
		
		
		return null;
	}

	@Override
	public Pager findAllDuratingOfYear2pager(Map params, Pager pager) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Pager findAllDuratingOfDay2pager(Map params, Pager pager) {
		// TODO 自动生成的方法存根
		return null;
	}

}