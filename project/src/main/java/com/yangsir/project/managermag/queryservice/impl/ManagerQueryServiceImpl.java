package com.yangsir.project.managermag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.ManagerBean;
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
	public IManagerQueryRepository managerQueryRepository;

	
	

	/**
	 * 
	 * @param map
	 */
	public ManagerBean getManagerByMap(Map map){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public ManagerBean getManger(long id){
		return managerQueryRepository.getManager(id);
	}

}