package com.yangsir.project.loginlogmag.handlerepository;

import com.yangsir.project.beans.LoginLogBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface ILoginLogHandleRepository {

	/**
	 * 
	 * @param loginLog
	 */
	public void saveLoginLog(LoginLogBean loginLog);

}