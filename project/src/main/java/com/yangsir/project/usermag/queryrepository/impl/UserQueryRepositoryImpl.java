package com.yangsir.project.usermag.queryrepository.impl;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.usermag.mapper.UserMapper;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository1;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
public class UserQueryRepositoryImpl implements IUserQueryRepository1 {

	public UserMapper m_UserMapper;

	public UserQueryRepositoryImpl(){

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

}