package com.yangsir.project.usermag.handleservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.handlerepository.IUserHandleRepository;
import com.yangsir.project.usermag.handleservice.IUserHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */

@Service
public class UserHandleServiceImpl implements IUserHandleService {

	@Resource
	private IUserHandleRepository userHandleRepositoryImpl;
	
	public UserHandleServiceImpl(){

	}

	@Override
	public void deleteUser(UserBean user) {

		userHandleRepositoryImpl.delete(user);
	}

	@Override
	public void saveBatchUser(List<UserBean> users) {

		userHandleRepositoryImpl.save(users);
	}

	@Override
	public void saveUser(UserBean user) {

		userHandleRepositoryImpl.save(user);
	}

	@Override
	public void updateUser(UserBean user) {

		userHandleRepositoryImpl.saveAndFlush(user);
	}

}