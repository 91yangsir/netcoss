
package com.yangsir.project.managermag.queryrepository;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;

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
	/**
	 * 根据参数查询管理员总数
	 * @param params 页面参数
	 * @return 返回管理员总数
	 */
	public int countManagerByParams(Map params);
	
	/**
	 * 根据参数查询管理员集合
	 * @param params 页面参数
	 * @return 返回分页的管理员集合
	 */
	public List<ManagerBean> findManagerByParams(Map params);
}