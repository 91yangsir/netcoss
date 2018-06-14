package com.yangsir.project.loginlogmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.aspectj.weaver.tools.Trace;

import com.yangsir.project.beans.LoginLogBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 * 登陆日志mapper
 */

public interface LoginLogMapper {

	/**
	 * 根据参数查询登陆日志总数
	 * @param params 页面参数
	 * @return 返回登陆日志总数
	 */
	@SelectProvider(type=LoginLogMapperSqlProvider.class,method="countLoginLogByParams")
	public int countLoginLogByParams(Map params);
	
	/**
	 * 根据参数查询登陆日志集合
	 * @param params 页面参数
	 * @return 返回分页的登陆日志集合
	 */
	@Results({
			@Result(id=true,property="id",column="id",javaType=Long.class),
			@Result(property="loginLogType",column="login_log_type",javaType=Integer.class),
			@Result(property="loginLogTime",column="login_log_time",javaType=Date.class),
			@Result(property="loginLogIP",column="login_log_ip",javaType=String.class),
			@Result(property="managerName",column="manager_name",javaType=String.class)
	})
	@SelectProvider(type=LoginLogMapperSqlProvider.class,method="findLoginLogByParams")
	public List<LoginLogBean> findLoginLogByParams(Map params);
}