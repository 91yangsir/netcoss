package com.yangsir.project.businessmag.queryservice.impl;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.businessmag.queryrepository.IBusinessQueryRepository;
import com.yangsir.project.businessmag.queryservice.IBusinessQueryService;

/**
 * 
 * @author dl
 *
 */
@Service
public class BusinessQueryServiceImpl implements IBusinessQueryService {
	
	@Resource
	private IBusinessQueryRepository businessQueryRepositoryImpl;
	
	public BusinessQueryServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BusinessBean getBusinessById(Long id) {
		// TODO Auto-generated method stub
		return businessQueryRepositoryImpl.getBusinessById(id);
	}

	@Override
	public Pager findBusiness2PageByMap(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<BusinessBean> getBusinessByUserId(Long id) {
		// TODO Auto-generated method stub
		return businessQueryRepositoryImpl.getBusinessByUserId(id);
	}

}
