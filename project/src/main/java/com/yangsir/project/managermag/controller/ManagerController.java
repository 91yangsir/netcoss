package com.yangsir.project.managermag.controller;

import com.yangsir.project.managermag.handleservice.IManagerHandleService;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */

@RequestMapping("/manager")
@Controller
public class ManagerController {
	@Resource
	public IManagerHandleService managerHandleServiceImpl;

	@Resource
	public IManagerQueryService managerQueryServiceImpl;

	/**
	 * 增加用户
	 */
	@RequestMapping("/add")
	public String Addmanager(ManagerBean manager) {

		managerHandleServiceImpl.saveManager(manager);

		return null;

	}

	/**
	 * 修改用户
	 */
	@RequestMapping("/update")
	public String UpdateManager(ModelAndView md, long id) {

		return null;

	}
	/**
	 * 刪除用戶
	 */

}