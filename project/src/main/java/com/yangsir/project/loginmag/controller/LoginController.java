package com.yangsir.project.loginmag.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.UserBean;

@RequestMapping(value = "/user")
@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		UserBean user=new UserBean();
		user.setUserName("yangsir");
		  mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping(value="/menu",method = { RequestMethod.POST })
	public String login1(@RequestParam("username") String username, @RequestParam("password") String password) {
		Subject currentUser = SecurityUtils.getSubject();
		System.out.println(1);
		if (!currentUser.isAuthenticated()) {
        	// 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            // rememberme
            token.setRememberMe(true);
            try {
            	
            	// 执行登录. 
                currentUser.login(token);
            } 
            // 所有认证时异常的父类. 
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
            	System.out.println("登录失败: " + ae.getMessage());
            	return "redirect:/project/managerLogin.ftl";
            }
        }
		
		return "powermag/menu";
	
	
	}
}
