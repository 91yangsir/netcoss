package com.yangsir.project.powermag.queryrepository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.powermag.mapper.PowerMapper;
import com.yangsir.project.powermag.queryrepository.IPowerQueryRepository;
@Repository
public class PowerQueryRepositoryImpl implements IPowerQueryRepository {
	@Resource
	private PowerMapper powerMapper;
	@Override
	public List<RoleBean> findAllRole() {
		// TODO Auto-generated method stub
		return powerMapper.findAllRole();
	}

	@Override
	public RoleBean findRoleByName(String name) {
		// TODO Auto-generated method stub
		return powerMapper.findRoleByName(name);
	}

	@Override
	public List<RoleBean> findByPage(int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		List<RoleBean> list=powerMapper.findAllRole();
		return list;
	}

}
