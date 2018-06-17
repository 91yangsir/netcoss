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
 * @created 13-6��-2018 16:34:36
 * 每日使用记录类
 */
@Entity
@Table(name="t_times_day")
public class DayUseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7214064900824636092L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	/**
	 * 日时长
	 */
	@Column(name="day_time")
	private double dayTime;

	/**
	 * 业务账号
	 */
	@Column(name="business_acc",length=20)
	private String businessAcc;
	
	/**
	 * 日期
	 */
	@Column(name="day")
	private Date day;
	
	/**
	 * 服务器IP
	 */
	@Column(name="server_ip",length=20)
	private String serverIP;
	
	/**
	 * 月使用费用
	 */
	@Column(name="day_money")
	private double dayMoney;

	public DayUseBean(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getDayTime() {
		return dayTime;
	}

	public void setDayTime(double dayTime) {
		this.dayTime = dayTime;
	}

	public String getBusinessAcc() {
		return businessAcc;
	}

	public void setBusinessAcc(String businessAcc) {
		this.businessAcc = businessAcc;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public double getDayMoney() {
		return dayMoney;
	}

	public void setDayMoney(double dayMoney) {
		this.dayMoney = dayMoney;
	}

	@Override
	public String toString() {
		return "DayUseBean [id=" + id + ", dayTime=" + dayTime + ", businessAcc=" + businessAcc + ", day=" + day
				+ ", serverIP=" + serverIP + ", dayMoney=" + dayMoney + "]";
	}

}