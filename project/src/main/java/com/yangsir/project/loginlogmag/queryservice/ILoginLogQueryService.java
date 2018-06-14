package com.yangsir.project.loginlogmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 * 登陆日志业务查询接口
 */
public interface ILoginLogQueryService {

	/**
	 * 根据参数分页查询登陆日志
	 * @param params
	 */
	public Pager findLoginLogByParams2Pager(Map params,Pager pager);

}