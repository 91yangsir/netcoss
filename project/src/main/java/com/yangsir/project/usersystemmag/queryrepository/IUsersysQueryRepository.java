package com.yangsir.project.usersystemmag.queryrepository;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 */
public interface IUsersysQueryRepository {

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
	 * @param user
	 */
	public UserBean findUser(UserBean user);

}