package com.yangsir.project.costmag.handleservice;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.handlerepository.ICostHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 */
public interface ICostHandleService {
	/**
	 * 根据条件对象删除资费
	 * @param cost
	 */
	public void deleteCostBean(CostBean cost);

	/**
	 * 根据条件增加资费对象
	 * @param cost
	 */
	public CostBean saveCostBean(CostBean cost);

	/**
	 * 根据条件修改资费
	 * @param cost
	 */
	public CostBean updateCostBean(CostBean cost);

}