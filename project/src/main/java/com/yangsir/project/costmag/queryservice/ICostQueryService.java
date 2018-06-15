package com.yangsir.project.costmag.queryservice;


import java.util.Set;

import org.springframework.data.domain.Page;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.costmag.queryrepository.ICostQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 */
public interface ICostQueryService {

	/**
	 * 通过id查询对象
	 * @param id
	 */
	public CostBean getCostBeanById(long id);

	/**
	 * 分页查询所有的对象
	 * @return
	 */
	public Pager findAllCostBean(Pager pager);
	/**
	 * 根据资费id查询所有的使用此资费的业务对象
	 * @param id
	 * @return
	 */
	public Set<BusinessBean> getCostBeanByIdBusiness(long id);
	
	/**
	 * 通过资费id查询该资费下用户的个数
	 * @param cost
	 * @return
	 */
	public int getCostBeanByBusinessBeanNums(Long id);
}