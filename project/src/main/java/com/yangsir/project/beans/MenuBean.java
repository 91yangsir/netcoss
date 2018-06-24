package com.yangsir.project.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author xiongbing
 * @version 
 * @created 
 */
@Entity
@Table(name="t_menu")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class MenuBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	/**
	 * menuName  菜单名称
	 */
	@Column(name="menu_name",length=20)
	private String menuName;
	
	/**
	 * menuNum  菜单编号
	 */
	@Column(name="menu_num",length=20)
	private String menuNum;
	/**
	 * menuLevel  菜单等级   1--一级菜单  2--二级菜单 3--3级菜单  以此类推
	 */
	@Column(name="menu_level",length=20)
	private int menuLevel;
	/**
	 * list 一个菜单权限可能被多个角色所共有
	 */
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="list")
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	private List<RoleBean> list;

	public MenuBean() {
	// TODO Auto-generated constructor stub
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(String menuNum) {
		this.menuNum = menuNum;
	}

	public int getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(int menuLevel) {
		this.menuLevel = menuLevel;
	}

	

	public List<RoleBean> getList() {
		return list;
	}


	public void setList(List<RoleBean> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "MenuBean [id=" + id + ", menuName=" + menuName + ", menuNum=" + menuNum + ", menuLevel=" + menuLevel
				+ ", list=" + list + "]";
	}


	



	

}