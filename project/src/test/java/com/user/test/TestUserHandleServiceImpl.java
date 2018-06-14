package com.user.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.usermag.handleservice.IUserHandleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserHandleServiceImpl {
	
	@Resource
	private IUserHandleService userHandleServiceImpl;
	
	@Test
	public void testSaveUser() {
		UserBean user = new UserBean();
		
		user.setUserName("狗狗");
		user.setUserGender(1);
		user.setUserCard("224478552233665544");
		user.setUserAcc("gogo");
		user.setUserPwd("333456");
		user.setUserTel("11115555777");
		user.setUserAddress("大河东路28号");
		user.setUserPost("666999");
		user.setUserQQ("44889955");
		
		RoleBean role = new RoleBean();
		role.setId(2);
		user.setRole(role);
		
		userHandleServiceImpl.saveUser(user);
	}
	
	@Test
	public void deleteUser() {
		UserBean user = null;
		user.setId(2l);
		
		userHandleServiceImpl.deleteUser(user);
	}
	
	
	
	
	
	
	

}
