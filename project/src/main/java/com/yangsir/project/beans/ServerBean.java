package com.yangsir.project.beans;

import java.io.Serializable;

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
@Table(name="t_server")
public class ServerBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8610534288812440253L;


	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	

	/**
	 * 服务器的IP地址
	 */
	@Column(name="server_ip",length=20)
	private String serverIp;
	
	public ServerBean(){

	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getServerIp() {
		return serverIp;
	}


	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}


	@Override
	public String toString() {
		return "ServerBean [id=" + id + ", serverIp=" + serverIp + "]";
	}


	



}