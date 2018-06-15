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
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
@Entity
@Table(name="t_server_info")
public class ServerInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	/**
	 * 使用服务器的登入时间
	 */
	@Column(name="server_in_time",length=20)
	private Date serverInTime;
	/**
	 * 使用服务器的登出时间
	 */
	@Column(name="server_out_time",length=20)
	private Date serverOutTime;
	/**
	 * 使用服务器的时间
	 */
	@Column(name="server_user_time",length=20)
	private long serverUseTime;
	/**
	 * 使用服务器的ip
	 */
	@Column(name="server_ip",length=20)
	private String serverIp;
	/**
	 * 使用服务器的业务账号
	 */
	@Column(name="business_acc",length=20)
	private String bussinesAcc;

	public ServerInfoBean(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getServerInTime() {
		return serverInTime;
	}

	public void setServerInTime(Date serverInTime) {
		this.serverInTime = serverInTime;
	}

	public Date getServerOutTime() {
		return serverOutTime;
	}

	public void setServerOutTime(Date serverOutTime) {
		this.serverOutTime = serverOutTime;
	}

	public long getServerUseTime() {
		return serverUseTime;
	}

	public void setServerUseTime(long serverUseTime) {
		this.serverUseTime = serverUseTime;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getBussinesAcc() {
		return bussinesAcc;
	}

	public void setBussinesAcc(String bussinesAcc) {
		this.bussinesAcc = bussinesAcc;
	}

	@Override
	public String toString() {
		return "ServerInfoBean [id=" + id + ", serverInTime=" + serverInTime + ", serverOutTime=" + serverOutTime
				+ ", serverUseTime=" + serverUseTime + ", serverIp=" + serverIp + ", bussinesAcc=" + bussinesAcc + "]";
	}

	
	
	
	
	

}