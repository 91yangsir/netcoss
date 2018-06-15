package com.yangsir.project.usermag.handleservice;

import java.util.List;

import com.yangsir.project.beans.UserBean;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IUserHandleService {

	/**
	 * 删除用户
	 * @param user
	 */
	public void deleteUser(UserBean user);

	/**
	 * 批量新增用户
	 * @param list
	 */
	public void saveBatchUser(List<UserBean> users);

	/**
	 * 新增用户
	 * @param user
	 */
	public void saveUser(UserBean user);

	/**
	 * 修改用户
	 * @param user
	 */
	public void updateUser(UserBean user);
	

}