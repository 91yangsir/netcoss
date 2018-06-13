package com.yangsir.project.usersystemmag.mapper;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:43
 */
public interface UsersysMapper {

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