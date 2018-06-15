package com.yangsir.project.costmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.handlerepository.ICostHandleRepository;
import com.yangsir.project.costmag.handleservice.ICostHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
@Service
public class CostHandleServiceImpl implements ICostHandleService {

	@Resource
	private ICostHandleRepository costHandleRepository;

	@Override
	public void deleteCostBean(CostBean cost) {
		// TODO Auto-generated method stub
		costHandleRepository.delete(cost);
	}

	@Override
	public CostBean saveCostBean(CostBean cost) {
		// TODO Auto-generated method stub
		costHandleRepository.save(cost);
		return cost;
	}

	@Override
	public CostBean updateCostBean(CostBean cost) {
		// TODO Auto-generated method stub
		costHandleRepository.saveAndFlush(cost);
		return cost;
	}

	@Override
	public CostBean updateCostTypeStart(CostBean cost) {
		// TODO Auto-generated method stub
		cost.setCostType(1);
		return costHandleRepository.saveAndFlush(cost);
	}

	@Override
	public CostBean updateCostTypeOut(CostBean cost) {
		// TODO Auto-generated method stub
		cost.setCostType(0);
		return costHandleRepository.saveAndFlush(cost);
	}
}