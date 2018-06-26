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
@Table(name="t_once_money")
public class TimeUseBean implements Serializable {
	
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
	 * 使用服务器的业务账号
	 */
	@Column(name="business_acc",length=20)
	private String business;
	/**
	 * 使用服务器的登入时间
	 */
	@Column(name="login_time",length=20)
	private Date loginTime;
	/**
	 * 使用服务器的登出时间
	 */
	@Column(name="out_time",length=20)
	private Date outTime;
	/**
	 * 使用服务器的时间
	 */
	@Column(name="use_time",length=20)
	private long useTime;
	/**
	 * 使用服务器的ip
	 */
	@Column(name="server_ip",length=20)
	private  String serverIp;
	/**
	 * 当前业务账号的总使用时间，第一次使用为0，后面每增加一条使用记录就需要更新此时间。
	 */
	@Column(name="use_totalTime",length=20)
	private  double totalUseTime;
	/**
	 * 当前业务账号的套餐
	 */
	
	@Column(name="use_cost",length=20)
	private  int cost;
	/**
	 * 本次使用消费的金额
	 */
	@Column(name="once_money",length=20)
	private double onceMoney;
	/**
	 * 备注，主要针对套餐超出后的说明。
	 */
	@Column(name="server_text",length=20)
	private String serverText;
	
	public TimeUseBean(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public long getUseTime() {
		return useTime;
	}

	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public double getTotalUseTime() {
		return totalUseTime;
	}

	public void setTotalUseTime(double totalUseTime) {
		this.totalUseTime = totalUseTime;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getOnceMoney() {
		return onceMoney;
	}

	public void setOnceMoney(double onceMoney) {
		this.onceMoney = onceMoney;
	}

	public String getServerText() {
		return serverText;
	}

	public void setServerText(String serverText) {
		this.serverText = serverText;
	}

	@Override
	public String toString() {
		return "TimeUseBean [id=" + id + ", business=" + business + ", loginTime=" + loginTime + ", outTime=" + outTime
				+ ", useTime=" + useTime + ", serverIp=" + serverIp + ", totalUseTime=" + totalUseTime + ", cost="
				+ cost + ", onceMoney=" + onceMoney + ", serverText=" + serverText + "]";
	}

	
	



}