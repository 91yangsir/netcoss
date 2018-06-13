
package com.yangsir.project.operationlogmag.queryservice.impl;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.operationlogmag.queryrepository.IOperationLogQueryRepository;
import com.yangsir.project.operationlogmag.queryservice.IOperationLogQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:41
 */
public class OperationLogQueryServiceImpl implements IOperationLogQueryService {

	public IOperationLogQueryRepository m_IOperationLogQueryRepository;

	public OperationLogQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param params
	 */
	public Pager findOperationLogByParams2Pager(Map params){
		return null;
	}

}