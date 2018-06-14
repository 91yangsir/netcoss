package com.yangsir.project.powermag.queryservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.powermag.queryrepository.IMenuQueryRepository;
import com.yangsir.project.powermag.queryservice.IMenuQueryService;
@Service
public class MenuQueryServiceImpl implements IMenuQueryService {
	@Resource
	private IMenuQueryRepository  menuQueryRepository;

	@Override
	public MenuBean getMenuById(long id) {
		// TODO Auto-generated method stub
		return menuQueryRepository.getMenuById(id);
	}

	@Override
	public MenuBean getMenuByName(String name) {
		// TODO Auto-generated method stub
		return menuQueryRepository.getMenuByName(name);
	}
	
	

}
