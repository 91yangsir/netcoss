package com.yangsir.project.loginlogmag.queryservice.impl;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.loginlogmag.queryrepository.ILoginLogQueryRepository;
import com.yangsir.project.loginlogmag.queryservice.ILoginLogQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:39
 */
public class LoginLogQueryServiceImpl implements ILoginLogQueryService {

	public ILoginLogQueryRepository m_ILoginLogQueryRepository;

	public LoginLogQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param params
	 */
	public Pager findLoginLogByParams2Pager(Map params){
		return null;
	}

}