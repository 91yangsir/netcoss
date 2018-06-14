package com.yangsir.project.powermag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.powermag.handlerepository.IMenuHandleRepository;
import com.yangsir.project.powermag.handleservice.IMenuHandleServcie;

@Service
public class MenuHandleServiceImpl implements IMenuHandleServcie {
	@Resource
	private IMenuHandleRepository menuHandleRepository;

	@Override
	public void addMenu(MenuBean bean) {
		
		menuHandleRepository.save(bean);
		
	}

	@Override
	public void deleteMenu(long id) {
		// TODO Auto-generated method stub
		menuHandleRepository.delete(id);
		
	}

	@Override
	public void updateMenu(MenuBean bean) {
		// TODO Auto-generated method stub
		menuHandleRepository.saveAndFlush(bean);
	}
	
}
