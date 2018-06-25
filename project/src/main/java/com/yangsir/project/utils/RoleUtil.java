package com.yangsir.project.utils;

import java.io.Serializable;

public class RoleUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String roleName;
	private String roleType;
	private String list;

	public RoleUtil() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoleUtil [id=" + id + ", roleName=" + roleName + ", roleType=" + roleType + ", list=" + list + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	
	
}
