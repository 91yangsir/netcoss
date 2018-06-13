package com.yangsir.project.managermag.queryservice.impl;

import java.util.Map;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.managermag.queryrepository.IManagerQueryRepository;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:40
 */
public class ManagerQueryServiceImpl implements IManagerQueryService {

	public IManagerQueryRepository m_IManagerQueryRepository;

	public ManagerQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

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
		return null;
	}

}