package com.yangsir.project.costmag.queryrepository;


import java.util.List;

import org.springframework.data.domain.Page;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 */
public interface ICostQueryRepository {

	/**
	 * 通过id查询对象
	 * @param id
	 */
	public CostBean getCostBeanById(long id);

	/**
	 * 分页查询所有的对象
	 * @return
	 */
	public Page<?> findAllCostBean();
	
	/**
	 * 根据资费id查询所有的使用此资费的业务对象
	 * @param id
	 * @return
	 */
	public List<BusinessBean> getCostBeanByIdBusiness(long id);

}