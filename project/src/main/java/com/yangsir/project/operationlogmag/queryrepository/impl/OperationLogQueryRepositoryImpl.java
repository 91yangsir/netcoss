package com.yangsir.project.operationlogmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import com.yangsir.project.operationlogmag.mapper.OperationLogMapper;
import com.yangsir.project.operationlogmag.queryrepository.IOperationLogQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:41
 */
public class OperationLogQueryRepositoryImpl implements IOperationLogQueryRepository {

	public OperationLogMapper m_OperationLogMapper;

	public OperationLogQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param params
	 */
	public int countOperationLogByParams(Map params){
		return 0;
	}

	/**
	 * 
	 * @param params
	 */
	public List findOperationLogByParams(Map params){
		return null;
	}

}