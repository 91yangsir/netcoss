package com.yangsir.project.usersystemmag.queryrepository.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usersystemmag.mapper.UsersysMapper;
import com.yangsir.project.usersystemmag.queryrepository.IUsersysQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
@Repository
public class UsersysQueryRespository implements IUsersysQueryRepository {
	@Resource
	public UsersysMapper UsersysMapper;

	@Override
	public UserBean findUserByUserAcc(String userAcc) {
		// TODO Auto-generated method stub
		return UsersysMapper.findUserByUserAcc(userAcc);
	}

	

	@Override
	public ServerInfoBean findServerInfoBeanByBusinessAcc(String businessAcc) {
		// TODO Auto-generated method stub
		return UsersysMapper.findServerInfoBeanByBusinessAcc(businessAcc);
	}



	@Override
	public int countBillByParams(Map params) {
		// TODO Auto-generated method stub
		return UsersysMapper.countBillByParams(params);
	}



	@Override
	public List<BillBean> findBillByParams(Map params) {
		// TODO Auto-generated method stub
		return UsersysMapper.findBillByParams(params);
	}



	@Override
	public CostBean findCostBeanByBusinessAcc(String businessAcc) {
		// TODO Auto-generated method stub
		return UsersysMapper.findCostBeanByBusinessAcc(businessAcc);
	}


}