package com.yangsir.project.loginmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.loginmag.handlerepository.UpdatePasswordManagerRepository;
import com.yangsir.project.loginmag.handleservice.IUpdateManagerPasswordHandleService;


@Service
public class UpdateManagerPassWordHandleServiceImpl implements IUpdateManagerPasswordHandleService{

	@Resource
	private UpdatePasswordManagerRepository upmr;
	
	@Override
	public void UpdateManagerPassword(ManagerBean managerbean) {
		upmr.saveAndFlush(managerbean);
		
	}

	
}
