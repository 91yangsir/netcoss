package com.yangsir.project.costmag.handleservice;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.handlerepository.ICostHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:36
 */
public interface ICostHandleService {



	/**
	 * 
	 * @param cost
	 */
	public void deleteCostBean(CostBean cost);

	/**
	 * 
	 * @param cost
	 */
	public void saveCostBean(CostBean cost);

	/**
	 * 
	 * @param cost
	 */
	public void updateCostBean(CostBean cost);

}