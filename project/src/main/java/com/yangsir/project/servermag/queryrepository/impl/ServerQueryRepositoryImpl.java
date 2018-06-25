package com.yangsir.project.servermag.queryrepository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.ServerBean;
import com.yangsir.project.servermag.mapper.ServerMapper;
import com.yangsir.project.servermag.queryrepository.IServerQueryRepository;

@Repository
public class ServerQueryRepositoryImpl implements IServerQueryRepository {

	@Resource
	private ServerMapper serverMapper;
	
	@Override
	public List<ServerBean> getAllServer() {

		return serverMapper.getAllServer();
	}

}
