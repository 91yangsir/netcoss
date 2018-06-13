
package com.yangsir.project.managermag.mapper;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:40
 */
public interface ManagerMapper {

	/**
	 * 
	 * @param id
	 */
	public ManagerBean getManager(int id);

	/**
	 * 
	 * @param map
	 */
	public ManagerBean getManagerByMap(Map map);

}