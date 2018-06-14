package com.yangsir.project.operationlogmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 * 操作日志业务层接口
 */
public interface IOperationLogQueryService {

	/**
	 * 根据参数分页查询操作日志
	 * @param params 页面参数
	 */
	public Pager findOperationLogByParams2Pager(Map params,Pager pager);

}