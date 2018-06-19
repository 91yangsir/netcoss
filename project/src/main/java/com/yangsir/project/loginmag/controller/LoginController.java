package com.yangsir.project.loginmag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.UserBean;

@RequestMapping(value = "/user")
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		UserBean user=new UserBean();
		user.setUserName("yangsir");
		  mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("/menu")
	public String login1() {
		return "menu";
	}
}
