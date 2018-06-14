
package com.yangsir.project.managermag.queryrepository;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 */
public interface IManagerQueryRepository {

	/**
	 * 
	 * @param id
	 * @param map
	 */
	public ManagerBean getManager(long id);

	public ManagerBean getManagerByMap();

}