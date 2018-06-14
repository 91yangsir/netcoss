package com.yangsir.project.costmag.queryservice.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.queryrepository.ICostQueryRepository;
import com.yangsir.project.costmag.queryservice.ICostQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
@Service
public class CostServiceImpl implements ICostQueryService {

	@Resource
	private ICostQueryRepository costQueryRepositoryImpl;
	@Override
	public CostBean getCostBeanById(long id) {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.getCostBeanById(id);
	}

	@Override
	public Page<?> findAllCostBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<BusinessBean> getCostBeanByIdBusiness(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}