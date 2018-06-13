package com.yangsir.project.usermag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:38
 */
public interface IUserQueryService {

	/**
	 * 
	 * @param map
	 */
	public Pager findUser2PageByMap(Map map);

	/**
	 * 
	 * @param id
	 */
	public UserBean findUserById(int id);

}