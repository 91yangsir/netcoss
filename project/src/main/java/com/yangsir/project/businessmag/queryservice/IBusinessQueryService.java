package com.yangsir.project.businessmag.queryservice;

import java.util.Map;
import java.util.Set;

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
	 * 根据用户id查询业务信息
	 * @param id
	 * @return 业务集合
	 */
	public Set<BusinessBean> getBusinessByUserId(Long id);
	

	/**
	 * 分页查询业务
	 * @param map
	 * @return
	 */
	public Pager findBusiness2PageByMap(Map map,Pager pager);
		
}
