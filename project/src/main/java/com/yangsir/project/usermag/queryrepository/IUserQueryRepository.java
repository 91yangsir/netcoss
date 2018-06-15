package com.yangsir.project.usermag.queryrepository;

import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;


public interface IUserQueryRepository {
	
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public UserBean getUserById(Long id);

	/**
	 * 分页查询用户
	 * @param map   
	 */
	public Pager findUser2PageByMap(Map map);
	
	/**
	 * 根据用户账号查询用户信息
	 * @param acc
	 * @return
	 */
	public UserBean getUserByAcc(String acc);

}