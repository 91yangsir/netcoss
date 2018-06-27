package com.yangsir.project.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */
@Table(name="t_manager")
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ManagerBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8749333438226149259L;

	@Id
	@Column
	@GenericGenerator(name = "hibernate.id", strategy = "identity")
	@GeneratedValue(generator = "hibernate.id")
	private long id;
	
	@Column(name = "man_acc", length = 20)
	private String managerAcc;//管理员账号
	
	@Column(name = "man_name", length = 20)
	private String managerName;//管理员名称
	
	@Column(name = "man_pwd", length = 20)
	private String managerPwd;//管理员密码
	
	@Column(name = "man_tel", length = 40)
	private String managerTel;//管理员电话
	
	@Column(name = "man_mail", length = 40)
	private String managerMail;//管理员邮箱
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_role_id")
	private  RoleBean  role;  //管理对应的角色

	public ManagerBean() {
		// TODO Auto-generated constructor stub
	}

	

	public String getManagerMail() {
		return managerMail;
	}



	public void setManagerMail(String managerMail) {
		this.managerMail = managerMail;
	}



	public RoleBean getRole() {
		return role;
	}



	public void setRole(RoleBean role) {
		this.role = role;
	}



	public ManagerBean(String managerAcc, String managerName, String managerPwd, String managerTel, String managerMail
			) {
		super();
		this.managerAcc = managerAcc;
		this.managerName = managerName;
		this.managerPwd = managerPwd;
		this.managerTel = managerTel;
		this.managerMail = managerMail;
		//this.role = role;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManagerAcc() {
		return managerAcc;
	}

	public void setManagerAcc(String managerAcc) {
		this.managerAcc = managerAcc;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPwd() {
		return managerPwd;
	}

	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}

	public String getManagerTel() {
		return managerTel;
	}

	public void setManagerTel(String managerTel) {
		this.managerTel = managerTel;
	}



	@Override
	public String toString() {
		return "ManagerBean [id=" + id + ", managerAcc=" + managerAcc + ", managerName=" + managerName + ", managerPwd="
				+ managerPwd + ", managerTel=" + managerTel + ", managerMail=" + managerMail + ", role=" + role + "]";
	}



	
	

}