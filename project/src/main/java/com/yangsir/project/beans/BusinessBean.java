package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.Set;

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
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */

@Entity
@Table(name="t_business")
public class BusinessBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8778239179404003415L;
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(name="business_acc",length=20)
	private String businessAcc;
	
	@Column(name="business_pwd",length=20)
	private String businessPwd;
	
	@Column(name="business_cost_next")
	private Long businessCostNext;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.ALL})
	@JoinColumn(name= "fk_user_id")
	private UserBean user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_cost_id")
	private CostBean cost;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_server_id")
	private ServerBean server;
	
	 
	public BusinessBean(){

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBusinessAcc() {
		return businessAcc;
	}


	public void setBusinessAcc(String businessAcc) {
		this.businessAcc = businessAcc;
	}


	public String getBusinessPwd() {
		return businessPwd;
	}


	public void setBusinessPwd(String businessPwd) {
		this.businessPwd = businessPwd;
	}


	public Long getBusinessCostNext() {
		return businessCostNext;
	}


	public void setBusinessCostNext(Long businessCostNext) {
		this.businessCostNext = businessCostNext;
	}


	public UserBean getUser() {
		return user;
	}


	public void setUser(UserBean user) {
		this.user = user;
	}


	public CostBean getCost() {
		return cost;
	}


	public void setCost(CostBean cost) {
		this.cost = cost;
	}


	public ServerBean getServer() {
		return server;
	}


	public void setServer(ServerBean server) {
		this.server = server;
	}

	@Override
	public String toString() {
		return "BusinessBean [id=" + id + ", businessAcc=" + businessAcc + ", businessPwd=" + businessPwd
				+ ", businessCostNext=" + businessCostNext + ", user=" + user + ", cost=" + cost + ", server=" + server
				+ "]";
	}
}