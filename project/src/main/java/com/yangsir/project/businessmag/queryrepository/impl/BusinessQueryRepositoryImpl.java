package com.yangsir.project.businessmag.queryrepository.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	
	@Override
	public BusinessBean getBusinessById(Long id) {

		return businessMapper.getBusinessById(id);
	}

	@Override
	public Set<BusinessBean> getBusinessByUserId(Long id) {

		return businessMapper.getBusinessByUserId(id);
	}

	@Override
	public BusinessBean getBusinessByAcc(String acc) {

		return businessMapper.getBusinessByAcc(acc);
	}

	
	@Override
	public int countBusinessByParams(Map params) {

		return businessMapper.countBusinessByParams(params);
	}

	@Override
	public List<BusinessBean> findBusinessByParams(Map params) {

		return businessMapper.findBusinessByParams(params);
	}

}
