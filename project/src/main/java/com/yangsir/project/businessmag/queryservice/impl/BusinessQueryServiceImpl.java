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
	
	
	@Override
	public BusinessBean getBusinessById(Long id) {

		return businessQueryRepositoryImpl.getBusinessById(id);
	}

	@Override
	public Set<BusinessBean> getBusinessByUserId(Long id) {

		return businessQueryRepositoryImpl.getBusinessByUserId(id);
	}
	
	@Override
	public Pager findBusiness2PageByMap(Map map,Pager pager) {

		map.put("index", pager.getIndex());
		map.put("rows", pager.getRows());
		pager.setDatas(businessQueryRepositoryImpl.findBusinessByParams(map));
		pager.setTotalRows(businessQueryRepositoryImpl.countBusinessByParams(map));
		return pager;
	}

}
