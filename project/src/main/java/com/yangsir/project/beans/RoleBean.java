package com.yangsir.project.beans;

import java.io.Serializable;

/**
 * @author xiongbing
 * @version 
 * @created 
 */
public class RoleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String menuName;//菜单名称
	private String menuNum;//菜单编号
	private String menuLevel;//菜单等级

	public RoleBean(){

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

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	@Override
	public String toString() {
		return "RoleBean [menuName=" + menuName + ", menuNum=" + menuNum + ", menuLevel=" + menuLevel + "]";
	}

	

}