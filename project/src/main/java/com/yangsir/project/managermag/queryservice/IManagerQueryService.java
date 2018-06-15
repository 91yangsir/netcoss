package com.yangsir.project.managermag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 */
public interface IManagerQueryService {

	/**
	 * 
	 * @param map
	 */
	public Pager findManagerByParams2Pager(Map params,Pager pager);

	/**
	 * 
	 * @param id
	 */
	public ManagerBean getManger(long id);

}