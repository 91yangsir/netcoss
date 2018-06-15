package com.yangsir.project.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="t_bill")
public class BillBean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="bill_year",length=20)
	private int billYear;//账单的年份
	
	@Column(name="bill_month",length=20)
	private int billMonth;//账单的月份 
	
	@Column(name="bill_money",length=20)
	private double billMoney;//账单金额
	
	@Column(name="bill_type",length=20)
	private int billType;//账单支付方式  1--微信  2--支付宝  3--银联
	
	@Column(name="bill_state",length=20)
	private int billState;//账单状态  0--未支付  1--已支付
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_user_id")
	private UserBean user;
	
	public BillBean() {
		// TODO Auto-generated constructor stub
	}
	


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	public int getBillYear() {
		return billYear;
	}


	public void setBillYear(int billYear) {
		this.billYear = billYear;
	}


	public int getBillMonth() {
		return billMonth;
	}


	public void setBillMonth(int billMonth) {
		this.billMonth = billMonth;
	}


	public double getBillMoney() {
		return billMoney;
	}


	public void setBillMoney(double billMoney) {
		this.billMoney = billMoney;
	}


	public int getBillType() {
		return billType;
	}


	public void setBillType(int billType) {
		this.billType = billType;
	}

	public int getBillState() {
		return billState;
	}



	public void setBillState(int billState) {
		this.billState = billState;
	}



	public UserBean getUser() {
		return user;
	}


	public void setUser(UserBean user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "BillBean [id=" + id + ", billYear=" + billYear + ", billMonth=" + billMonth + ", billMoney=" + billMoney
				+ ", billType=" + billType + ", billState=" + billState + ", user=" + user + "]";
	}
	


}