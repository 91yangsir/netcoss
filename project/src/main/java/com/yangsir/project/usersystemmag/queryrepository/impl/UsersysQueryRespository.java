package com.yangsir.project.usersystemmag.queryrepository.impl;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usersystemmag.mapper.UsersysMapper;
import com.yangsir.project.usersystemmag.queryrepository.IUsersysQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:43
 */
public class UsersysQueryRespository implements IUsersysQueryRepository {

	public UsersysMapper m_UsersysMapper;

	public UsersysQueryRespository(){

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
	 * @param user
	 */
	public UserBean findUser(UserBean user){
		return null;
	}

}