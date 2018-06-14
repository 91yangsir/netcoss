package com.yangsir.project.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author xiongbing
 * @version 1.0
 * @created 
 */
@Entity
@Table(name="t_role")
public class RoleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5081056177957728087L;
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	/**
	 *  rolenName  角色名称
	 */
	@Column(name="role_name",length=20)
	private String rolenName;
	/**
	 *  roleType 角色类型   1--超级管理员 2--普通管理员  3--用户
	 */
	@Column(name="role_type",length=20)
	private int  roleType;
	
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