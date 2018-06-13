package com.yangsir.project.managermag.queryrepository.impl;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.managermag.mapper.ManagerMapper;
import com.yangsir.project.managermag.queryrepository.IManagerQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:40
 */
public class ManagerQueryRepositoryImpl implements IManagerQueryRepository {

	public ManagerMapper m_ManagerMapper;

	public ManagerQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param id
	 * @param map
	 */
	public ManagerBean getManager(int id, Map map){
		return null;
	}

	public ManagerBean getManagerByMap(){
		return null;
	}

}