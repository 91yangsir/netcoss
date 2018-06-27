package com.yangsir.project.usersystemmag.controller;

import com.yangsir.project.usersystemmag.queryservice.IUsersysQueryService;
import com.yangsir.project.usersystemmag.handleservice.IUsersysHandleService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.UserBean;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
@RequestMapping("/usersystem")
@Controller
public class UsersysController {
	@Resource
	public IUsersysQueryService usersysQueryServiceImpl;
	
	@Resource
	public IUsersysHandleService usersysHandleServiceImpl;

	//查询用户个人信息
	@RequestMapping(value = "/find", method = {RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public ModelAndView showUserInfo(String userAcc,String userinfo) {
		UserBean user=usersysQueryServiceImpl.findUserByUserAcc(userAcc);
		System.out.println(user);
		
		ModelAndView modelAndView=new ModelAndView();
		if (userinfo.equals("个人信息")) {
			modelAndView.setViewName("usersystemmag/userinfo");
			modelAndView.addObject("user", user);
			
		}else if (userinfo.equals("账单信息")) {
			modelAndView.setViewName("usersystemmag/usersysbill");
			modelAndView.addObject("user", user);
			
		}
		
		return modelAndView;
		
	}
	//修改提交
	@RequestMapping(value = "/update", method = {RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	public ModelAndView updateUserInfo(UserBean user) {
		System.out.println(user);
		usersysHandleServiceImpl.updateUser(user);
		 ModelAndView modelAndView =new ModelAndView();
		 modelAndView.setViewName("usersystemmag/userinfo");
		 modelAndView.addObject("user", user);
		 return modelAndView;
			
	}




}