package com.yangsir.project.businessmag.queryrepository.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.businessmag.mapper.BusinessMapper;
import com.yangsir.project.businessmag.queryrepository.IBusinessQueryRepository;

/**
 * 
 * @author dl
 *
 */

@Repository
public class BusinessQueryRepositoryImpl implements IBusinessQueryRepository {

	@Resource
	private BusinessMapper businessMapper;
	
	public BusinessQueryRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BusinessBean getBusinessById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pager findBusiness2PageByMap(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

}
