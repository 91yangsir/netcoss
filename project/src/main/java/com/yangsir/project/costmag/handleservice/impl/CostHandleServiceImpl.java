package com.yangsir.project.costmag.handleservice.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	public CostBean updateCostStateStart(CostBean cost) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cost.setCostStart(date);
		return costHandleRepository.saveAndFlush(cost);
	}

	@Override
	public CostBean updateCostStateOut(CostBean cost) {
		// TODO Auto-generated method stub
		cost.setCostStart(null);
		return costHandleRepository.saveAndFlush(cost);
	}
}