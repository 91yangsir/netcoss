package com.yangsir.project.operationlogmag.handleService;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 * 操作日志业务层接口
 */
public interface IOperationLogHandleService {

	/**
	 * 新增操作日志
	 * @param operationLog 操作日志信息
	 */
	public void saveOperationLog(OperationLogBean operationLog);

}