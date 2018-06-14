package com.yangsir.project.managermag.controller;

import com.yangsir.project.managermag.handleservice.IManagerHandleService;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */


@Controller
public class ManagerController {
		@Resource
	public IManagerHandleService m_IManagerHandleService;
		
		@Resource
	public IManagerQueryService m_IManagerQueryService;

	public ManagerController(){

	}

	public void finalize() throws Throwable {

	}

}