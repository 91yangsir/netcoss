package com.yangsir.project.operationlogmag.queryrepository;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 * 操作日志持久层接口
 */
public interface IOperationLogQueryRepository {

	/**
	 *  根据参数查询操作日志总数
	 * @param params 查询参数
	 * @return 操作日志总数
	 */
	public int countOperationLogByParams(Map params);

	/**
	 * 根据参数查询登陆日志集合
	 * @param params 查询参数
	 * @return 返回分页的登陆日志集合
	 */
	public List<OperationLogBean> findOperationLogByParams(Map params);

}