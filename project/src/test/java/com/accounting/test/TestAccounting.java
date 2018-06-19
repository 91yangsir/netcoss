package com.accounting.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.accountingmag.queryservice.IAccountingQueryService;
import com.yangsir.project.beans.Pager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestAccounting {

	@Resource
	private IAccountingQueryService accountingQueryServiceImpl;
	
	@Test
	public void findDay() {
		Pager pager = new Pager(1,10);
		Map<String, Object> params = new HashMap<>();
		
		params.put("business", "qq");
		
		accountingQueryServiceImpl.findAllDuratingOfDay2pager(params, pager);
		System.out.println(pager);
		
	}
	
	@Test
	public void findYear() {
		Pager pager = new Pager(1,10);
		Map<String, Object> params = new HashMap<>();
		params.put("accounting", "aaa");
		
		accountingQueryServiceImpl.findAllDuratingOfYear2pager(params, pager);
		System.out.println(pager);
		
	}
	
	@Test
	public void findMonth() {
		Pager pager = new Pager(1,10);
		Map<String, Object> params = new HashMap<>();
		params.put("accounting", "aaa");
		
		accountingQueryServiceImpl.findAllDuratingOfMonth2pager(params, pager);
		System.out.println(pager);
		
	}
}
