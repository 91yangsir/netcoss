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
 * @created 13-6��-2018 16:34:40
 * 月使用记录类
 */

@Entity
@Table(name="t_times_month")
public class MonthUseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7363685821892305297L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	/**
	 * 月时长
	 */
	@Column(name="month_time")
	private double monthTime;

	/**
	 * 业务账号
	 */
	@Column(name="business_acc",length=20)
	private String businessAcc;
	
	/**
	 * 月份
	 */
	@Column(name="month")
	private Date month;
	
	/**
	 * 服务器IP
	 */
	@Column(name="server_ip",length=20)
	private String serverIP;
	
	/**
	 * 月使用费用
	 */
	@Column(name="month_money")
	private double monthMoney;

	public MonthUseBean() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getMonthTime() {
		return monthTime;
	}

	public void setMonthTime(double monthTime) {
		this.monthTime = monthTime;
	}

	public String getBusinessAcc() {
		return businessAcc;
	}

	public void setBusinessAcc(String businessAcc) {
		this.businessAcc = businessAcc;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public double getMonthMoney() {
		return monthMoney;
	}

	public void setMonthMoney(double monthMoney) {
		this.monthMoney = monthMoney;
	}

	@Override
	public String toString() {
		return "MonthUseBean [id=" + id + ", monthTime=" + monthTime + ", businessAcc=" + businessAcc + ", month="
				+ month + ", serverIP=" + serverIP + ", monthMoney=" + monthMoney + "]";
	}
	
}