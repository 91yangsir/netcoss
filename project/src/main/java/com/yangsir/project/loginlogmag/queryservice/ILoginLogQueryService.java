package com.yangsir.project.loginlogmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface ILoginLogQueryService {

	/**
	 * 
	 * @param params
	 */
	public Pager findLoginLogByParams2Pager(Map params);

}