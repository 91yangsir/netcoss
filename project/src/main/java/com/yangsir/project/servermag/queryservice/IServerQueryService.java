package com.yangsir.project.servermag.queryservice;

import java.util.List;

import com.yangsir.project.beans.ServerBean;

public interface IServerQueryService {
	
	/**
	 * 获取所有服务器
	 * @return
	 */
	public List<ServerBean> getAllServer();
	

}
