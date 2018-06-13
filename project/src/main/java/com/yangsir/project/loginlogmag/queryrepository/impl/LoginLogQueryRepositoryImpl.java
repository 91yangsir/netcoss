package com.yangsir.project.loginlogmag.queryrepository.impl;

import java.util.List;

import com.yangsir.project.loginlogmag.mapper.LoginLogMapper;
import com.yangsir.project.loginlogmag.queryrepository.ILoginLogQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:39
 */
public class LoginLogQueryRepositoryImpl implements ILoginLogQueryRepository {

	public LoginLogMapper m_LoginLogMapper;

	public LoginLogQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	public int countLoginLogByParams(){
		return 0;
	}

	public List findLoginLogByParams(){
		return null;
	}

}