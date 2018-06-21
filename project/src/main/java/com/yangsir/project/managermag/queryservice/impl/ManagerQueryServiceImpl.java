package com.yangsir.project.managermag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.managermag.queryrepository.IManagerQueryRepository;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */
@Service
public class ManagerQueryServiceImpl implements IManagerQueryService {
	@Resource
	public IManagerQueryRepository managerQueryRepositoryImpl;

	/**
	 * 
	 * @param id
	 */
	public ManagerBean getManger(long id) {
		return managerQueryRepositoryImpl.getManager(id);
	}

	/**
	 * 
	 */

	@Override
	public Pager findManagerByParams2Pager(Map params, Pager pager) {
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		System.out.println(managerQueryRepositoryImpl.findManagerByParams(params));
		pager.setDatas(managerQueryRepositoryImpl.findManagerByParams(params));
		System.out.println(managerQueryRepositoryImpl.countManagerByParams(params));
		pager.setTotalRows(managerQueryRepositoryImpl.countManagerByParams(params));
		
		return pager;
	}

	@Override
	public RoleBean getRoleBeanByName(String roleName) {
		// TODO Auto-generated method stub
		return managerQueryRepositoryImpl.getRoleBeanByName(roleName);
	}

}