package com.yangsir.project.usermag.queryrepository;

import java.util.Map;

import com.yangsir.project.beans.Pager;


public interface IUserQueryRepository1 {

	/**
	 * 
	 * @param map   
	 */
	public Pager findUser2PageByMap(Map map);

}