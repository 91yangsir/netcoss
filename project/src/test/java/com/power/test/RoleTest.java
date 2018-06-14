package com.power.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.powermag.handleservice.IPowerHandleService;
import com.yangsir.project.powermag.queryservice.IMenuQueryService;
import com.yangsir.project.powermag.queryservice.IPowerQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class RoleTest {
	@Resource
	private IPowerHandleService powerHanderServiceImpl;
	@Resource
	private IMenuQueryService menuQueryServiceImpl;
	@Resource
	private IPowerQueryService powerQueryServiceImpl;
	//查询所有的角色才能显示角色所对应的权限信息。
	@Test
	public void addRole() {
		RoleBean bean=new RoleBean();
		bean.setRoleName("权限管理员");
		bean.setRoleType(2);
		powerHanderServiceImpl.addRole(bean);
	}
	
	@Test
	public void choicePower() {
		RoleBean bean=new RoleBean();
		bean.setRoleName("权限资费管理员");
		bean.setRoleType(3);
		MenuBean bean1=menuQueryServiceImpl.getMenuByName("权限管理系统");
		System.out.println(bean1);
		MenuBean bean2=menuQueryServiceImpl.getMenuByName("资费管理系统");
		System.out.println(bean2);
		List<MenuBean> list=new ArrayList<>();
		list.add(bean1);
		list.add(bean2);
		powerHanderServiceImpl.roleChoicePower(bean, list);
		
	}
	
	@Test
	public void deleteRole() {
		powerHanderServiceImpl.deleteRoleById(6l);
	}
	
	@Test
	public void findAllRole() {
		System.out.println(powerQueryServiceImpl.findAllRole());
	}
	
	@Test
	public void findRoleByName() {
		System.out.println(powerQueryServiceImpl.findRoleByName("权限管理员"));
	}
	
	//更新角色的权限
	@Test
	public void updateRole() {
		RoleBean bean=powerQueryServiceImpl.findRoleByName("资费管理员");
		System.out.println(bean);
		MenuBean bean1=menuQueryServiceImpl.getMenuById(7l);
		List<MenuBean> list=new ArrayList<MenuBean>();
		list.add(bean1);
		bean.setList(list);
		powerHanderServiceImpl.updateRolePower(bean);
		
		
	}
}
