package com.yangsir.project.beans;

import java.io.Serializable;

/**
 * @author xiongbing
 * @version 1.0
 * @created 
 */
public class RoleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5081056177957728087L;
	private long id;
	/**
	 *  rolenName  角色名称
	 */
	private String rolenName;
	/**
	 *  roleType 角色类型   1--超级管理员 2--普通管理员  3--用户
	 */
	private int  roleType;//角色类型   1--超级管理员 2--普通管理员  3--用户
	
	public RoleBean() {
		// TODO Auto-generated constructor stub
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRolenName() {
		return rolenName;
	}

	public void setRolenName(String rolenName) {
		this.rolenName = rolenName;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}


	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", rolenName=" + rolenName + ", roleType=" + roleType + "]";
	}

	
	

	

}