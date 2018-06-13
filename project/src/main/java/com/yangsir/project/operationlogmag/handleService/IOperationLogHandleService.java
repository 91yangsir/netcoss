package com.yangsir.project.operationlogmag.handleService;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface IOperationLogHandleService {

	/**
	 * 
	 * @param operationLog
	 */
	public void deleteOperationLog(OperationLogBean operationLog);

	/**
	 * 
	 * @param operationLog
	 */
	public void saveOperationLog(OperationLogBean operationLog);

	/**
	 * 
	 * @param operationLog
	 */
	public void updateOperationLog(OperationLogBean operationLog);

}