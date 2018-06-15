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
		
		user.setUserName("喵喵喵");
		user.setUserGender(1);
		user.setUserCard("224478552233665544");
		user.setUserAcc("mmm");
		user.setUserPwd("333456");
		user.setUserTel("11115555777");
		user.setUserAddress("大河东路28号");
		user.setUserPost("666999");
		user.setUserQQ("44889955");
		user.setUserState(1);
		
		RoleBean role = new RoleBean();
		role.setId(2);
		user.setRole(role);
		
		userHandleServiceImpl.saveUser(user);
	}
	
	@Test
	public void deleteUser() {
		UserBean user = new UserBean();
		user.setId(5l);
		
		userHandleServiceImpl.deleteUser(user);
	}
	
	@Test
	public void updateUser() {
		UserBean user = new UserBean();
		user.setId(2l);
		
		user.setUserGender(0);
		user.setUserName("喔喔");
		user.setUserAcc("www");
		user.setUserState(1);
		
		userHandleServiceImpl.updateUser(user);
	}

}
