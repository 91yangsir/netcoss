package com.yangsir.project.usermag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;
import com.yangsir.project.usermag.queryservice.IUserQueryService;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
@Service
public class UserQueryServiceImpl implements IUserQueryService {

	@Resource
	private IUserQueryRepository userQueryRepositoryImpl;
	

	@Override
	public UserBean getUserById(Long id) {

		return userQueryRepositoryImpl.getUserById(id);
	}

	@Override
	public Pager findUser2PageByMap(Map map,Pager pager) {

		map.put("index", pager.getIndex());
		map.put("rows", pager.getRows());
		pager.setDatas(userQueryRepositoryImpl.findUserByParams(map));
		pager.setTotalRows(userQueryRepositoryImpl.countUserByParams(map));
		return pager;
	}

}