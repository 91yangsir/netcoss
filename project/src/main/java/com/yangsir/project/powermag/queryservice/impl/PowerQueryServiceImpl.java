package com.yangsir.project.powermag.queryservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.powermag.queryrepository.IPowerQueryRepository;
import com.yangsir.project.powermag.queryservice.IPowerQueryService;
@Service
public class PowerQueryServiceImpl implements IPowerQueryService{
	@Resource
	private IPowerQueryRepository powerQueryRepositoryImpl; 
	@Override
	public List<RoleBean> findAllRole() {
		// TODO Auto-generated method stub
		return powerQueryRepositoryImpl.findAllRole();
	}

	@Override
	public RoleBean findRoleByName(String name) {
		// TODO Auto-generated method stub
		return powerQueryRepositoryImpl.findRoleByName(name);
	}

	@Override
	public List<RoleBean> findByPage(int page, int rows) {
		// TODO Auto-generated method stub
		return powerQueryRepositoryImpl.findByPage(page, rows);
	}

}
