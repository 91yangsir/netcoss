package com.yangsir.project.usermag.handlerepository;

import java.util.List;

import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:38
 */
public interface IUserQueryRepository {

	/**
	 * 
	 * @param list
	 */
	public void deleteBatchUser(List list);

	/**
	 * 
	 * @param user
	 */
	public void deleteUser(UserBean user);

	/**
	 * 
	 * @param list
	 */
	public void saveBatchUser(List list);

	/**
	 * 
	 * @param user
	 */
	public void saveUser(UserBean user);

	/**
	 * 
	 * @param user
	 */
	public void updateUser(UserBean user);

}