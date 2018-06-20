package com.user.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.queryrepository.IUserQueryRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserQueryRepositoryImpl {

	@Resource
	private IUserQueryRepository userQueryRepositoryImpl;
	
	@Test
	public void getUserByAcc() {
		UserBean user = userQueryRepositoryImpl.getUserByAcc("郭sir");
//		UserBean user = userQueryRepositoryImpl.getUserById(2l);
		System.out.println(user);
	}
	
}
