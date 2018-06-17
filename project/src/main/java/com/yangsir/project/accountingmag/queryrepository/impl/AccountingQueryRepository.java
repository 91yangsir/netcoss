package com.yangsir.project.accountingmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.accountingmag.mapper.AccountingMapper;
import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:34
 * 账务查询持久层实现类
 */
@Repository
public class AccountingQueryRepository implements IAccountingQueryRepository {

	@Resource
	public AccountingMapper accountingMapper;

	@Override
	public int countDuratingOfMonthByParams(Map params) {
		return accountingMapper.countDuratingOfMonthByParams(params);
	}

	@Override
	public List<MonthUseBean> findDuratingOfMonthByParams(Map params) {
		return accountingMapper.findDuratingOfMonthByParams(params);
	}

	@Override
	public int countDuratingOfDayByParams(Map params) {
		return accountingMapper.countDuratingOfDayByParams(params);
	}

	@Override
	public List<DayUseBean> findDuratingOfDayByParams(Map params) {
		return accountingMapper.findDuratingOfDayByParams(params);
	}

	@Override
	public int countDuratingOfYearByParams(Map params) {
		return accountingMapper.countDuratingOfYearByParams(params);
	}

	@Override
	public List<YearUseBean> findDuratingOfYearByParams(Map params) {
		return accountingMapper.findDuratingOfYearByParams(params);
	}

}