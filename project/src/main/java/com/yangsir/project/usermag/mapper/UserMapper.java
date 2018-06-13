package com.yangsir.project.usermag.mapper;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:42
 */
public interface UserMapper {

	/**
	 * 
	 * @param map
	 */
	public Pager findUser2PageByMap(Map map);

}