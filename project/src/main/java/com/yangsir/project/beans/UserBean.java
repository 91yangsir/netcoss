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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
@Entity
@Table(name="t_user")
public class UserBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6611059676970199486L;
	
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(name="user_name",length=20)
	private String userName;
	
	@Column(name="user_gender")
	private Integer userGender;
	
	@Column(name="user_card",length=18)
	private String userCard;
	
	@Column(name="user_acc",length=20)
	private String userAcc;
	
	@Column(name="user_pwd",length=20)
	private String userPwd;
	
	@Column(name="user_tel",length=11)
	private String userTel;
	
	@Column(name="user_address",length=255)
	private String userAddress;
	
	@Column(name="user_post",length=6)
	private String userPost;
	
	@Column(name="user_qq",length=15)
	private String userQQ;
	
	@Column(name="user_state")
	private Integer userState;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_role_id")
	private RoleBean role;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="user")
	@Cascade(value= {CascadeType.ALL})
	private Set<BusinessBean> business;

	public UserBean(){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserGender() {
		return userGender;
	}

	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}

	public String getUserCard() {
		return userCard;
	}

	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}

	public String getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPost() {
		return userPost;
	}

	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}

	public Set<BusinessBean> getBusiness() {
		return business;
	}

	public void setBusiness(Set<BusinessBean> business) {
		this.business = business;
	}

	public Integer getUserState() {
		return userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", userGender=" + userGender + ", userCard=" + userCard
				+ ", userAcc=" + userAcc + ", userPwd=" + userPwd + ", userTel=" + userTel + ", userAddress="
				+ userAddress + ", userPost=" + userPost + ", userQQ=" + userQQ + ", userState=" + userState + ", role="
				+ role + ", business=" + business + "]";
	}
	
}