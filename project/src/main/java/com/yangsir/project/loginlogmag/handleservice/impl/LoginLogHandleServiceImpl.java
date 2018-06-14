package com.yangsir.project.loginlogmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.loginlogmag.handleservice.ILoginLogHandleService;
import com.yangsir.project.loginlogmag.handlerepository.ILoginLogHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 * 登陆日志业务类
 */
@Service
public class LoginLogHandleServiceImpl implements ILoginLogHandleService {

	@Resource
	public ILoginLogHandleRepository loginLogHandleRepositoryImpl;

	/**
	 * 新增登陆日志
	 * @param loginLog
	 */
	public void saveLoginLog(LoginLogBean loginLog){
		loginLogHandleRepositoryImpl.save(loginLog);
	}

}