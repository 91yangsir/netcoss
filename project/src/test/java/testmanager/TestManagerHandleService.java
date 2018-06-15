package testmanager;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.managermag.handleservice.IManagerHandleService;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestManagerHandleService {
		
	@Resource
	private  IManagerHandleService   managerHandleServiceImpl;
	@Resource
	private  IManagerQueryService   managerQueryServiceImpl;
	
	
	/**
	 *管理員分页模糊查詢
	 */
	@Test
	public void getmanager2page() {
		
		Map  m = new HashMap<>();
		 m.put("managerName", "李");
		m.put("roleid", 11);
		Pager	pager =new Pager(1,10);
		System.out.println(managerQueryServiceImpl.findManagerByParams2Pager(m, pager));
		
	}
	
	
	
	
	@Test
	public void  getManagerBean() {
		
		System.out.println(managerQueryServiceImpl.getManger(1));

}
	
	@Test
	public void saveManager() {
		
		ManagerBean manager =new ManagerBean();
		
		manager.setManagerAcc("diao");
		manager.setManagerName("yangsir");
		manager.setManagerTel("13398989989");
		manager.setManagerMail("yy@163.com");
		managerHandleServiceImpl.saveManager(manager);				
	}
	
	
	/**
	 * 修改管理员
	 */
	@Test
	public void updateManager() {
		
		ManagerBean  mb= managerQueryServiceImpl.getManger(1);
		
		System.out.println(mb);
		mb.setManagerName("太君");
		
		
		 managerHandleServiceImpl.updateManatger(mb);
		System.out.println(mb);
	}
	
	@Test
	public void deletemanger() {
		
		ManagerBean  m= managerQueryServiceImpl.getManger(2);
		 managerHandleServiceImpl.deleteManager(m);
	}
	



}
