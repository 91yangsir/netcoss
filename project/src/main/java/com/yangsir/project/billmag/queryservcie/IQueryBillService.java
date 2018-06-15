package com.yangsir.project.billmag.queryservcie;

import com.yangsir.project.beans.TimeUseBean;

public interface IQueryBillService {
	/**
	 * 
	 * @param account 传入的业务账号名称
	 * @return 返回的是具有最大使用时间的TimeUseBean，便于统计使用总时长
	 */
	public TimeUseBean getMaxUseTimeBill(String account);
	
}
