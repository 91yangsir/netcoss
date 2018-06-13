package com.yangsir.project.costmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.costmag.queryrepository.ICostQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:36
 */
public interface ICostQueryService {


	/**
	 * 
	 * @param id
	 */
	public CostBean getCostBeanById(long id);

	/**
	 * 
	 * @param map
	 */
	public Pager getListByNameAndTypeToPager(Map map);

}