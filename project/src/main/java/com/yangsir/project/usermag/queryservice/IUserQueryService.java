package com.yangsir.project.usermag.queryservice;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IUserQueryService {

	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public UserBean getUserById(Long id);
	
	/**
	 * 查询所有开通用户
	 * @return
	 */
	public List<?> getAllUser();

	/**
	 * 分页查询用户
	 * @param map   
	 */
	public Pager findUser2PageByMap(Map map,Pager pager);

}