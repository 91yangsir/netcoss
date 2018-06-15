package com.user.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.queryservice.IUserQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserQueryServiceImpl {

	@Resource
	private IUserQueryService userQueryServiceImpl;
	
	@Test
	public void testGetUserById() {
		
		UserBean user = userQueryServiceImpl.getUserById(1l);
		System.out.println(user);
	}
	
}
