package com.yangsir.project.loginlogmag.handleservice;

import com.yangsir.project.beans.LoginLogBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 * 登陆日志操作接口
 */
public interface ILoginLogHandleService {

	/**
	 * 新增登陆日志
	 * @param loginLog 
	 */
	public void saveLoginLog(LoginLogBean loginLog);

}