package com.yangsir.project.usersystemmag.queryservice.impl;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usersystemmag.queryrepository.IUsersysQueryRepository;
import com.yangsir.project.usersystemmag.queryservice.IUsersysQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:43
 */
public class UsersysQueryServiceImpl implements IUsersysQueryService {

	public IUsersysQueryRepository m_IUsersysQueryRepository;

	public UsersysQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param bill
	 */
	public BillBean findBill(BillBean bill){
		return null;
	}

	/**
	 * 
	 * @param server
	 */
	public ServerInfoBean findServerInfo(ServerInfoBean server){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public UserBean findUser(long id){
		return null;
	}

}