package com.framestudy.springjpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

@Entity
@Table(name="t_customer")
@OptimisticLocking(type=OptimisticLockType.VERSION)
public class CustomerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5981503821604850944L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(name="customer_name",length=20)
	private String customerName;
	
	@Column(name="customer_telphone",length=11)
	private String telphone;
	
	@Column
	private Integer gender;
	
	@Column(name="customer_birthday")
	private Date birthday;
	
	@Column(name="login_name",length=20)
	private String loginName;
	
	@Version
	private Integer version;
	
	//属性不参与到持久化
	@Transient
	private Date startTime;
	@Transient
	private Date endTime;
	
	
	
	
	public CustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBean(Long id, String customerName, Date birthday) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.birthday = birthday;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", customerName=" + customerName + ", telphone=" + telphone + ", gender="
				+ gender + ", birthday=" + birthday + ", loginName=" + loginName + ", version=" + version
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
