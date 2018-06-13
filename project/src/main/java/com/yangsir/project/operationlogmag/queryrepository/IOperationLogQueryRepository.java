package com.yangsir.project.operationlogmag.queryrepository;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:38
 */
public interface IOperationLogQueryRepository {

	/**
	 * 
	 * @param params
	 */
	public int countOperationLogByParams(Map params);

	/**
	 * 
	 * @param params
	 */
	public List findOperationLogByParams(Map params);

}