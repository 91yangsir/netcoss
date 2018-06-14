package com.yangsir.project.costmag.queryrepository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.mapper.CostMapper;
import com.yangsir.project.costmag.queryrepository.ICostQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
@Repository
public class CostQueryRepositoryImpl implements ICostQueryRepository {

	@Resource
	private CostMapper costMapper;
	
	@Override
	public CostBean getCostBeanById(long id) {
		// TODO Auto-generated method stub
		return costMapper.getCostBeanById(id);
	}

	@Override
	public Page<?> findAllCostBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusinessBean> getCostBeanByIdBusiness(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}