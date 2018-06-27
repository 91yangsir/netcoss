package com.yangsir.project.loginmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.UserBean;
import com.yangsir.project.loginmag.handlerepository.UpdatePasswordUserRepository;
import com.yangsir.project.loginmag.handleservice.IUpdateUserPasswordHandleService;

@Service
public class UpdateUserPasswordHandleServiceImpl implements IUpdateUserPasswordHandleService{
  
	@Resource
	private UpdatePasswordUserRepository upur;
	
	@Override
	public void UpdateUserPassword(UserBean userbean) {
		
		upur.saveAndFlush(userbean);
	}

}
