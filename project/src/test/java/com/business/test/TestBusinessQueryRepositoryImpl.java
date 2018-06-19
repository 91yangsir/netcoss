package com.business.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.businessmag.queryrepository.IBusinessQueryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestBusinessQueryRepositoryImpl {

	@Resource
	private IBusinessQueryRepository businessQueryRepositoryImpl;
	
	@Test
	public void getBusinessByAcc() {
		
		BusinessBean bean = businessQueryRepositoryImpl.getBusinessByAcc("gaga");
		System.out.println(bean);
		
	}
	
	
}
