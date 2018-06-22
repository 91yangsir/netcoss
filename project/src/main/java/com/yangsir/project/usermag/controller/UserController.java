package com.yangsir.project.usermag.controller;

import com.yangsir.project.usermag.handleservice.IUserHandleService;
import com.yangsir.project.usermag.queryservice.IUserQueryService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@Resource
	public IUserHandleService userHandleServiceImpl;
	@Resource
	public IUserQueryService userQueryServiceImpl;

	@RequestMapping(value="/save",method= {RequestMethod.POST}, produces = {
	"application/json;charset=utf-8" })
	public String saveUser(UserBean user) {
		try {
			userHandleServiceImpl.saveUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "usermag/success";
	}


}