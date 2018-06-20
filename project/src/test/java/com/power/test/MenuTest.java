package com.power.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.powermag.handleservice.IMenuHandleServcie;
import com.yangsir.project.powermag.queryservice.IMenuQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MenuTest {
	@Resource
	private IMenuHandleServcie  menuHandleServiceImpl;
	@Resource
	private IMenuQueryService  menuQueryServiceImpl;
	//通过名字查菜单才能显示该菜单对应的角色。
	@Test
	public void addMenu() {
		MenuBean bean=new MenuBean();
		bean.setMenuLevel(2);
		bean.setMenuName("用户管理系统");
		bean.setMenuNum("021");
		menuHandleServiceImpl.addMenu(bean);
	}
	
	@Test
	public void updateMenu() {
		MenuBean bean=new MenuBean();
		bean.setId(15l);
		bean.setMenuLevel(1);
		bean.setMenuName("sdadasdd服we务系统");
		bean.setMenuNum("1111");
		menuHandleServiceImpl.updateMenu(bean);
	}
	
	@Test
	public void deleteMenu() {
		
		menuHandleServiceImpl.deleteMenu(15);
	}
	@Test
	public void getMenu() {
		
		MenuBean bean = (MenuBean) menuQueryServiceImpl.getMenuById(28l);
		System.out.println(bean);
	}
	
	@Test
	public void getMenuName() {
		
		MenuBean bean = (MenuBean) menuQueryServiceImpl.getMenuByName("前台营运系统");
		System.out.println(bean);
		
	}
}
