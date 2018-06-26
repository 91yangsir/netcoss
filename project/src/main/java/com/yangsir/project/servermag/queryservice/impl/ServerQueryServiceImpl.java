package com.yangsir.project.servermag.queryservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.ServerBean;
import com.yangsir.project.servermag.queryrepository.IServerQueryRepository;
import com.yangsir.project.servermag.queryservice.IServerQueryService;

@Service
public class ServerQueryServiceImpl implements IServerQueryService{

	@Resource
	private IServerQueryRepository serverQueryRepositoryImpl;
	
	@Override
	public List<ServerBean> getAllServer() {

		return serverQueryRepositoryImpl.getAllServer();
	}

}
