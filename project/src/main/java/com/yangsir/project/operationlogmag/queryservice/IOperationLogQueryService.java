package com.yangsir.project.operationlogmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:38
 */
public interface IOperationLogQueryService {

	/**
	 * 
	 * @param params
	 */
	public Pager findOperationLogByParams2Pager(Map params);

}