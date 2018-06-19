package com.yangsir.project.usermag.queryrepository;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * 
 * @author dl
 *
 */

public interface IUserQueryRepository {
	
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public UserBean getUserById(Long id);

	/**
	 * 根据用户账号查询用户信息
	 * @param acc
	 * @return
	 */
	public UserBean getUserByAcc(String acc);
	
	/**
	 * 根据多参数查询用户数量
	 * @param params 页面获得的参数
	 * @return 
	 */
	public int countUserByParams(Map params);
	
	/**
	 * 根据参数查询用户,获得用户集合
	 * @param params 页面获得的参数
	 * @return 分页的用户集合
	 */
	public List<UserBean> findUserByParams(Map params);

}