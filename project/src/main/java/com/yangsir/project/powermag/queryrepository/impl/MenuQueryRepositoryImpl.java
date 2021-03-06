package com.yangsir.project.powermag.queryrepository.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.powermag.mapper.MenuMapper;
import com.yangsir.project.powermag.queryrepository.IMenuQueryRepository;
@Repository
public class MenuQueryRepositoryImpl implements IMenuQueryRepository {
	
	@Resource
	private MenuMapper menuMapper;
	@Override
	public MenuBean getMenuById(long id) {
	
		return  menuMapper.getMenuById(id);
		
	}
	@Override
	public MenuBean getMenuByName(String name) {
		
		return menuMapper.getMenuByName(name);
	}

}
