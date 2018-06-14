package com.yangsir.project.managermag.handleservice;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 */


public interface IManagerHandleService {

	/**
	 * 
	 * @param manager
	 */
	public void deleteManager(ManagerBean manager);

	/**
	 * 
	 * @param manager
	 */
	public void saveManager(ManagerBean manager);

	public void updateManatger(ManagerBean manager);

}