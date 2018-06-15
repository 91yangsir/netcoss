package com.yangsir.project.businessmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.businessmag.handlerepository.IBusinessHandleRepository;
import com.yangsir.project.businessmag.handleservice.IBusinessHandleService;

/**
 * 
 * @author dl
 *
 */

@Service
public class BusinessHandleServiceImpl implements IBusinessHandleService {

	@Resource
	private IBusinessHandleRepository businessHandleRepositoryImpl;
	
	public BusinessHandleServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void saveBusiness(BusinessBean business) {

		businessHandleRepositoryImpl.save(business);
	}

	@Override
	public void deleteBusiness(BusinessBean business) {

		businessHandleRepositoryImpl.delete(business);
	}

	@Override
	public void updateBusiness(BusinessBean business) {

		businessHandleRepositoryImpl.saveAndFlush(business);
	}

}
