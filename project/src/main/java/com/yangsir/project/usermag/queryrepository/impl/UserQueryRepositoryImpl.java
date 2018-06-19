package com.yangsir.project.usermag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.mapper.UserMapper;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */

@Repository
public class UserQueryRepositoryImpl implements IUserQueryRepository {

	@Resource
	private UserMapper userMapper;
	

	@Override
	public UserBean getUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}


	@Override
	public UserBean getUserByAcc(String acc) {

		return userMapper.getUserByAcc(acc);
	}

	@Override
	public int countUserByParams(Map params) {
		// TODO Auto-generated method stub
		return userMapper.countUserByParams(params);
	}

	@Override
	public List<UserBean> findUserByParams(Map params) {
		// TODO Auto-generated method stub
		return userMapper.findUserByParams(params);
	}


}