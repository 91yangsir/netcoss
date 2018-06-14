package com.yangsir.project.powermag.handleservice;

import java.util.List;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IPowerHandleService  {
	
	public void addRole(RoleBean bean);
	
	public void roleChoicePower(RoleBean role,List<MenuBean> list);
	
	public void deleteRoleById(long id);
	
	public void updateRolePower(RoleBean bean);

}