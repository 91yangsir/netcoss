package com.yangsir.project.usersystemmag.queryservice;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:39
 */
public interface IUsersysQueryService {

	/**
	 * 
	 * @param bill
	 */
	public BillBean findBill(BillBean bill);

	/**
	 * 
	 * @param server
	 */
	public ServerInfoBean findServerInfo(ServerInfoBean server);

	/**
	 * 
	 * @param id
	 */
	public UserBean findUser(long id);

}