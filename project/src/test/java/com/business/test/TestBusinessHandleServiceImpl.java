package com.business.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.businessmag.handleservice.IBusinessHandleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestBusinessHandleServiceImpl {

	@Resource
	private IBusinessHandleService businessHandleServiceImpl;
	
	
	@Test
	public void testSaveBusiness() {
		BusinessBean business = new BusinessBean();
		
		business.setBusinessAcc("jojo");
		business.setBusinessPwd("444666");
		business.setBusinessState(1);
		
		UserBean user = new UserBean();
		user.setId(2l);
		business.setUser(user);
		
		business.setBusinessCostNext(1l);
		
		businessHandleServiceImpl.saveBusiness(business);
		
	}
	
	@Test
	public void testDeleteBusiness() {
		BusinessBean business = new BusinessBean();
		
		business.setId(4l);
		
		businessHandleServiceImpl.deleteBusiness(business);
	}
	
	@Test
	public void testUpdateBusiness() {
		BusinessBean business = new BusinessBean();
		business.setId(4l);
		
		business.setBusinessAcc("啊哈哈");
		business.setBusinessPwd("778899");
		
		businessHandleServiceImpl.updateBusiness(business);
	}
	
	
}
