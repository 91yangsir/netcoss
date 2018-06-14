package com.yangsir.project.operationlogmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:41 操作日志mapper
 */
public interface OperationLogMapper {

	/**
	 * 根据参数查询操作日志总数
	 * 
	 * @param params
	 *            查询参数
	 * @return 操作日志总数
	 */
	@SelectProvider(type = OperationLogMapperSqlProvider.class, method = "countOperationLogByParams")
	public int countOperationLogByParams(@Param("params")Map params);

	/**
	 * 根据参数查询登陆日志集合
	 * 
	 * @param params
	 *            查询参数
	 * @return 返回分页的登陆日志集合
	 */
	@Results({ @Result(id = true, property = "id", column = "id", javaType = Long.class),
			@Result(property = "operationLogType", column = "operation_log_type", javaType = Integer.class),
			@Result(property = "operationLogTime", column = "operation_log_time", javaType = Date.class),
			@Result(property = "operationLogData", column = "operation_log_data", javaType = String.class),
			@Result(property = "operationLogModel", column = "operation_log_model", javaType = Integer.class),
			@Result(property = "managerName", column = "manager_name", javaType = String.class) })
	@SelectProvider(type = OperationLogMapperSqlProvider.class, method = "findOperationLogByParams")
	public List<OperationLogBean> findOperationLogByParams(@Param("params")Map params);
}