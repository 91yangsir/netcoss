package com.server.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.ServerBean;
import com.yangsir.project.servermag.queryservice.IServerQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestServerQueryServiceImpl {

	@Resource
	private IServerQueryService serverQueryServiceImpl;
	
	@Test
	public void testGetAllServer() {
		List<ServerBean> datas = serverQueryServiceImpl.getAllServer();
		System.out.println(datas);
	}
	
}
