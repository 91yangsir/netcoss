package com.yangsir.project.usersystemmag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usersystemmag.queryrepository.IUsersysQueryRepository;
import com.yangsir.project.usersystemmag.queryservice.IUsersysQueryService;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
@Service
public class UsersysQueryServiceImpl implements IUsersysQueryService {
	@Resource
	private IUsersysQueryRepository usersysQueryRepository;

	@Override
	public UserBean findUserByUserAcc(String userAcc) {
		// TODO Auto-generated method stub
		return usersysQueryRepository.findUserByUserAcc(userAcc);
	}

	@Override
	public Pager findBillBeanByToPager(Map params, Pager pager) {
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(usersysQueryRepository.findBillByParams(params));
		pager.setTotalRows(usersysQueryRepository.countBillByParams(params));
		return pager;
	}

	@Override
	public ServerInfoBean findServerInfoBeanByBusinessAcc(String businessAcc) {
		// TODO Auto-generated method stub
		return usersysQueryRepository.findServerInfoBeanByBusinessAcc(businessAcc);
	}

	@Override
	public CostBean findCostBeanByBusinessAcc(String businessAcc) {
		// TODO Auto-generated method stub
		return usersysQueryRepository.findCostBeanByBusinessAcc(businessAcc);
	}


	

}