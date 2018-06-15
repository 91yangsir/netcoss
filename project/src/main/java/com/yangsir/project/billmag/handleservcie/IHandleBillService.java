package com.yangsir.project.billmag.handleservcie;

import com.yangsir.project.beans.ServerInfoBean;

public interface IHandleBillService {

	/**
	 * 通过服务器的使用信息来增加次账单
	 * @param info 服务器的使用信息
	 */
	public void addOnceBill(ServerInfoBean info);
}
