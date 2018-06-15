package com.yangsir.project.businessmag.handleservice;

import com.yangsir.project.beans.BusinessBean;

/**
 * 
 * @author dl
 * @version 1.0
 */
public interface IBusinessHandleService {

	/**
	 * 新增业务
	 * @param business
	 */
	public void saveBusiness(BusinessBean business);
	
	
	/**
	 * 删除业务
	 * @param business
	 */
	public void deleteBusiness(BusinessBean business);
	
	
	/**
	 * 修改业务
	 * @param business
	 */
	public void updateBusiness(BusinessBean business);
	
}
