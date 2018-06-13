package com.yangsir.project.costmag.mapper;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.CostBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:35
 */
public interface CostMapper {

	/**
	 * 
	 * @param map
	 */
	public int countCostBeanByNameAndType(Map map);

	/**
	 * 
	 * @param id
	 */
	public CostBean getCostBeanById(long id);

	/**
	 * 
	 * @param map
	 */
	public List<?> getListByNameAndType(Map map);

}