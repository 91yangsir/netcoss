package com.yangsir.project.businessmag.queryrepository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;

/**
 * 
 * @author dl
 *
 */
public interface IBusinessQueryRepository {
	
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
	 * 根据业务名称查询业务详情(资费信息)
	 * @param acc
	 * @return
	 */
	public BusinessBean getBusinessByAcc(String acc);
	
	
	/**
	 * 根据多参数查询业务数量
	 * @param params
	 * @return
	 */
	public int countBusinessByParams(Map params);

	/**
	 * 根据参数查询业务，获得集合
	 * @param params
	 * @return
	 */
	public List<BusinessBean> findBusinessByParams(Map params);
	
}
