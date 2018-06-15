package com.yangsir.project.businessmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;

/**
 * 
 * @author dl
 *
 */
public interface IBusinessQueryService {

	/**
	 * 根据id查询业务
	 * @param id
	 * @return
	 */
	public BusinessBean getBusinessById(Long id);
	
	
	/**
	 * 分页查询业务
	 * @param map
	 * @return
	 */
	public Pager findBusiness2PageByMap(Map map);
	
}
