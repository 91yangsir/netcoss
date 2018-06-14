package com.loginlog.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.loginlogmag.handleservice.ILoginLogHandleService;
import com.yangsir.project.loginlogmag.queryservice.ILoginLogQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class LoginLogTest {

	@Resource
	private ILoginLogHandleService loginLogHandleServiceImpl;
	@Resource
	private ILoginLogQueryService loginLogQueryServiceImpl;
	
	
	
	@Test
	public void saveLoginLog() {
		LoginLogBean logBean = new LoginLogBean();
		logBean.setLoginLogIP("123");
		logBean.setLoginLogTime(new Date());
		logBean.setLoginLogType(0);
		logBean.setManagerName("vv");
		loginLogHandleServiceImpl.saveLoginLog(logBean);
	}
}
