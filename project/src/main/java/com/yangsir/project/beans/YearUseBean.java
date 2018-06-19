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
 * @created 13-6��-2018 16:34:43
 * 年使用记录类
 */
@Entity
@Table(name="t_times_year")
public class YearUseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2061053493798148420L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	/**
	 * 年时长
	 */
	@Column(name="year_time")
	private double yearTime;

	/**
	 * 业务账号
	 */
	@Column(name="business_acc",length=20)
	private String businessAcc;
	
	/**
	 * 年份
	 */
	@Column(name="year")
	private String year;
	
	/**
	 * 服务器IP
	 */
	@Column(name="server_ip",length=20)
	private String serverIP;

	public YearUseBean() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getYearTime() {
		return yearTime;
	}

	public void setYearTime(double yearTime) {
		this.yearTime = yearTime;
	}

	public String getBusinessAcc() {
		return businessAcc;
	}

	public void setBusinessAcc(String businessAcc) {
		this.businessAcc = businessAcc;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	@Override
	public String toString() {
		return "YearUseBean [id=" + id + ", yearTime=" + yearTime + ", businessAcc=" + businessAcc + ", year=" + year
				+ ", serverIP=" + serverIP + "]";
	}

}