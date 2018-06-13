package com.yangsir.project.usermag.queryservice.impl;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository1;
import com.yangsir.project.usermag.queryservice.IUserQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
public class UserQueryServiceImpl implements IUserQueryService {

	public IUserQueryRepository1 m_IUserQueryRepository;

	public UserQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findUser2PageByMap(Map map){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public UserBean findUserById(int id){
		return null;
	}

}