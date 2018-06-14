package com.yangsir.project.managermag.queryrepository.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.managermag.mapper.ManagerMapper;
import com.yangsir.project.managermag.queryrepository.IManagerQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */
@Repository
public class ManagerQueryRepositoryImpl implements IManagerQueryRepository {
	@Resource
	public ManagerMapper managerMapper;

	

	
	/**
	 * 
	 * @param id
	 * @param map
	 */
	public ManagerBean getManager(long id){
		
		
		
		return  managerMapper.getManager(id);
	}

	public ManagerBean getManagerByMap(){
		return null;
	}

}