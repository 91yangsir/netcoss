package com.yangsir.project.utils;

import java.io.Serializable;

public class BillUtil implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String account;
	private String idCard;
	private double costMoney;
	private String Year;
	private String month;
	private String payType;
	private String payState;
	
	public BillUtil() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public double getCostMoney() {
		return costMoney;
	}

	public void setCostMoney(double costMoney) {
		this.costMoney = costMoney;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	@Override
	public String toString() {
		return "BillUtil [id=" + id + ", account=" + account + ", idCard=" + idCard + ", costMoney=" + costMoney
				+ ", Year=" + Year + ", month=" + month + ", payType=" + payType + ", payState=" + payState + "]";
	}
	
	
	
}
