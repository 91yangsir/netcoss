package com.yangsir.project.powermag.handleservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.powermag.handlerepository.IPowerHandleRepository;
import com.yangsir.project.powermag.handleservice.IPowerHandleService;
@Service
public class PowerHandleServiceImpl implements IPowerHandleService {
	
	@Resource
	private IPowerHandleRepository powerHandleRepository;

	@Override
	public void roleChoicePower(RoleBean role, List<MenuBean> list) {
		// TODO Auto-generated method stub
		role.setList(list);
		powerHandleRepository.save(role);
		
	}

	@Override
	public void deleteRoleById(long id) {
		// TODO Auto-generated method stub
		powerHandleRepository.delete(id);
		
	}

	@Override
	public void updateRolePower(RoleBean bean) {
		// TODO Auto-generated method stub
		powerHandleRepository.saveAndFlush(bean);
		
	}

	@Override
	public void addRole(RoleBean bean) {
		// TODO Auto-generated method stub
		powerHandleRepository.save(bean);
	}

}
