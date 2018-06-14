package com.yangsir.project.operationlogmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.operationlogmag.mapper.OperationLogMapper;
import com.yangsir.project.operationlogmag.queryrepository.IOperationLogQueryRepository;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 操作日志持久层查询实现类
 */
@Repository
public class OperationLogQueryRepositoryImpl implements IOperationLogQueryRepository {

	@Resource
	public OperationLogMapper operationLogMapper;

	/**
	 * 根据参数查询操作日志总数
	 * 
	 * @param params
	 *            查询参数
	 * @return 操作日志总数
	 */
	public int countOperationLogByParams(Map params){
		return operationLogMapper.countOperationLogByParams(params);
	}

	/**
	 * 根据参数查询登陆日志集合
	 * 
	 * @param params
	 *            查询参数
	 * @return 返回分页的登陆日志集合
	 */
	public List<OperationLogBean> findOperationLogByParams(Map params){
		return operationLogMapper.findOperationLogByParams(params);
	}

}