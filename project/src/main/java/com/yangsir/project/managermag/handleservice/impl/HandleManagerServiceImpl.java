package com.yangsir.project.managermag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.managermag.handlerepository.IManagerHandleRepository;
import com.yangsir.project.managermag.handleservice.IManagerHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 */

@Service
public class HandleManagerServiceImpl implements IManagerHandleService {

	@Resource
	public IManagerHandleRepository managerHandleRepository;

	/**
	 * 删除管理员
	 * 
	 * @param manager
	 */
	public void deleteManager(ManagerBean manager) {

		managerHandleRepository.delete(manager);

	}

	/**
	 * 添加管理员
	 * 
	 * @param manager
	 */
	public void saveManager(ManagerBean manager) {

		managerHandleRepository.save(manager);

	}

	/**
	 * 修改管理员
	 */
	public void updateManatger(ManagerBean manager) {

		managerHandleRepository.saveAndFlush(manager);

	}

}