package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
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
	private String roleName;
	/**
	 *  roleType 角色类型   1--超级管理员 2--普通管理员  3--用户
	 */
	@Column(name="role_type",length=20)
	private int  roleType;
	/**
	 * list 此角色的拥有的菜单权限集合。
	 */
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="t_power",joinColumns=@JoinColumn(name="fk_role_id"),
	inverseJoinColumns=@JoinColumn(name="fk_menu_id"))
	private List<MenuBean> list;
	
	public RoleBean() {
		// TODO Auto-generated constructor stub
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

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}
	


	public List<MenuBean> getList() {
		return list;
	}


	public void setList(List<MenuBean> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", roleName=" + roleName + ", roleType=" + roleType + ", list=" + list + "]";
	}


}