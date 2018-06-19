package com.business.test;

import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.businessmag.queryrepository.IBusinessQueryRepository;
import com.yangsir.project.businessmag.queryservice.IBusinessQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestBusinessQueryServiceImpl {
	
	@Resource
	private IBusinessQueryService businessQueryServiceImpl;
	
	@Test
	public void getBusinessById() {
		
		BusinessBean bean = businessQueryServiceImpl.getBusinessById(2l);
		System.out.println(bean);
	}
	
	
	@Test
	public void getBusinessByUserId() {
		
		Set<BusinessBean> beans = businessQueryServiceImpl.getBusinessByUserId(2l);
		System.out.println(beans);
	}
	
	
}
