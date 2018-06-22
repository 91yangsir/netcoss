package com.yangsir.project.costmag.queryservice.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.costmag.queryrepository.ICostQueryRepository;
import com.yangsir.project.costmag.queryservice.ICostQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
@Service
public class CostQueryServiceImpl implements ICostQueryService {

	@Resource
	private ICostQueryRepository costQueryRepositoryImpl;
	@Override
	public CostBean getCostBeanById(long id) {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.getCostBeanById(id);
	}

	@Override
	public Pager findAllCostBean(Pager pager) {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.findAllCostBean(pager);
	}

	@Override
	public Set<BusinessBean> getCostBeanByIdBusiness(long id) {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.getCostBeanByIdBusiness(id);
	}

	@Override
	public int getCostBeanByBusinessBeanNums(Long id) {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.getCostBeanByBusinessBeanNums(id);
	}

	@Override
	public List<CostBean> getFindAllCostBean() {
		// TODO Auto-generated method stub
		return costQueryRepositoryImpl.getFindAllCostBean();
	}

}