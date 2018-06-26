package com.yangsir.project.servermag.queryrepository;

import java.util.List;

import com.yangsir.project.beans.ServerBean;

public interface IServerQueryRepository {
	
	/**
	 * 获取所有服务器
	 * @return
	 */
	public List<ServerBean> getAllServer();
	

}
