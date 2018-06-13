package com.yangsir.project.managermag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface IManagerQueryService {

	/**
	 * 
	 * @param map
	 */
	public ManagerBean getManagerByMap(Map map);

	/**
	 * 
	 * @param id
	 */
	public ManagerBean getManger(long id);

}