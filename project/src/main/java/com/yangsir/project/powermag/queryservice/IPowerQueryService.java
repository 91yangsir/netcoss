package com.yangsir.project.powermag.queryservice;

import java.util.List;

import com.yangsir.project.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IPowerQueryService {
	/**
	 * 
	 * @return 返回所有的角色集合，用于页面展示
	 */
	public List<RoleBean> findAllRole();
	
	/**
	 * 在添加角色的时候查询此名称的角色是否已经存在。
	 * @return 返回值为空代表不存在，不为空代表存在，存在就不能添加了。
	 */
	public RoleBean findRoleByName(String name);
	
	public List<RoleBean> findByPage(int page,int rows);
	
}