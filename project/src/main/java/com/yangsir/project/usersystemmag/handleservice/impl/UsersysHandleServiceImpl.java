package com.yangsir.project.usersystemmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usersystemmag.handlerepository.IUsersysHandleRepository;
import com.yangsir.project.usersystemmag.handleservice.IUsersysHandleService;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
@Service
public class UsersysHandleServiceImpl implements IUsersysHandleService {
	@Resource
	private IUsersysHandleRepository usersysHandleRepository;

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 */
	public void updateUser(UserBean user) {
		usersysHandleRepository.saveAndFlush(user);
	}

}