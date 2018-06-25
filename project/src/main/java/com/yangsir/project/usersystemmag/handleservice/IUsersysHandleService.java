package com.yangsir.project.usersystemmag.handleservice;

import com.yangsir.project.beans.UserBean;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 */
public interface IUsersysHandleService {

	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUser(UserBean user);

}