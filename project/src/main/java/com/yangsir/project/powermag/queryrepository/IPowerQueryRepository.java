package com.yangsir.project.powermag.queryrepository;

import java.util.List;

import com.yangsir.project.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IPowerQueryRepository {

	/**
	 * 
	 * @return 返回所有的角色集合，用于页面展示
	 */
	public List<RoleBean> findAllRole();
	
	/**
	 * 在添加角色的时候查询此名称的角色是否已经存在。
	 * @return 0代表不存在，1代表存在。
	 */
	public RoleBean findRoleByName(String name);
}