package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 * 登陆日志类
 */

@Entity
@Table(name="t_login_log")
public class LoginLogBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4922226563385345243L;


	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	/**
	 * 操作类型
	 */
	@Column(name="login_log_type")
	private int loginLogType;
	
	/**
	 * 操作时间
	 */
	@Column(name="login_log_time")
	private Date loginLogTime;
	
	/**
	 * 操作地ip
	 */
	@Column(name="login_log_ip",length=40)
	private String loginLogIP;
	
	/**
	 * 操作人员
	 */
	@Column(name="manager_name",length=20)
	private String managerName;
	
	public LoginLogBean(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLoginLogType() {
		return loginLogType;
	}

	public void setLoginLogType(int loginLogType) {
		this.loginLogType = loginLogType;
	}

	public Date getLoginLogTime() {
		return loginLogTime;
	}

	public void setLoginLogTime(Date loginLogTime) {
		this.loginLogTime = loginLogTime;
	}

	public String getLoginLogIP() {
		return loginLogIP;
	}

	public void setLoginLogIP(String loginLogIP) {
		this.loginLogIP = loginLogIP;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "LoginLogBean [id=" + id + ", loginLogType=" + loginLogType + ", loginLogTime=" + loginLogTime
				+ ", loginLogIP=" + loginLogIP + ", managerName=" + managerName + "]";
	}

}