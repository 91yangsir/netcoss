package com.yangsir.project.accountingmag.queryservice.impl;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.accountingmag.queryrepository.IAccountingQueryRepository;
import com.yangsir.project.accountingmag.queryservice.IAccountingQueryService;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;
import com.yangsir.project.beans.BusinessBean;
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
	private IAccountingQueryRepository accountingQueryRepositoryImpl;
	@Resource
	private IUserQueryRepository userQueryRepositoryImpl;
	
	/**
	 * 如果是查询所有月时长，根据账务账号查出所有业务账号，在查出分页对象，若是查询确定业务账号下月时长
	 */
	@Override
	public Pager findAllDuratingOfMonth2pager(Map params, Pager pager) {
		Set<String> business = new HashSet<>();
		if (params.get("accounting")!=null) {
			UserBean user = userQueryRepositoryImpl.getUserByAcc((String) params.get("accounting"));
			for (BusinessBean bus : user.getBusiness()) {
				business.add(bus.getBusinessAcc());
			}
		} else {
			business.add((String) params.get("businessAcc"));
		}
		
		params.put("business", business);
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(accountingQueryRepositoryImpl.findDuratingOfMonthByParams(params));
		pager.setTotalRows(accountingQueryRepositoryImpl.countDuratingOfMonthByParams(params));
		return pager;
	}

	/**
	 * 根据账务账号查出业务账号，根据业务账号分页查询年时长
	 */
	@Override
	public Pager findAllDuratingOfYear2pager(Map params, Pager pager) {
		UserBean user = userQueryRepositoryImpl.getUserByAcc((String) params.get("accounting"));
		Set<String> business = new HashSet<>();
		for (BusinessBean bus : user.getBusiness()) {
			business.add(bus.getBusinessAcc());
		}
		params.put("business", business);
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(accountingQueryRepositoryImpl.findDuratingOfYearByParams(params));
		pager.setTotalRows(accountingQueryRepositoryImpl.countDuratingOfYearByParams(params));
		return pager;
	}

	/**
	 * 根据业务账号查询日时长
	 */
	@Override
	public Pager findAllDuratingOfDay2pager(Map params, Pager pager) {
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(accountingQueryRepositoryImpl.findDuratingOfDayByParams(params));
		pager.setTotalRows(accountingQueryRepositoryImpl.countDuratingOfDayByParams(params));
		return pager;
	}

}