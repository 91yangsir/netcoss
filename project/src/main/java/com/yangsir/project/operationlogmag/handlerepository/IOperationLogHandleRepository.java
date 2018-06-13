package com.yangsir.project.operationlogmag.handlerepository;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface IOperationLogHandleRepository {

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