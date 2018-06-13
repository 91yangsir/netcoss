package com.yangsir.project.managermag.handlerepository;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface IManagerHandleRepository {

	/**
	 * 
	 * @param manger
	 */
	public void deleteManager(ManagerBean manger);

	/**
	 * 
	 * @param manager
	 */
	public void saveManager(ManagerBean manager);

	public int updateManager();

}