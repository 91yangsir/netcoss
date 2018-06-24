package com.yangsir.project.powermag.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.powermag.handleservice.impl.PowerHandleServiceImpl;
import com.yangsir.project.powermag.mapper.MenuMapper;
import com.yangsir.project.powermag.mapper.PowerMapper;
import com.yangsir.project.powermag.queryrepository.impl.PowerQueryRepositoryImpl;
import com.yangsir.project.utils.RoleUtil;
import com.yangsir.project.viewobject.DataGrid;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Resource
	private MenuMapper menuMapper;
	@Resource
	private  PowerMapper powerMapper;
	@Resource
	private PowerQueryRepositoryImpl powerQuery;
	@Resource
	private PowerHandleServiceImpl powerHandleServiceImpl;
	
	

	@RequestMapping(value="/get",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public DataGrid  findAllRole(int page,int rows){
	List<RoleBean> list= powerQuery.findByPage(page, rows);
	List<RoleUtil> list1=new ArrayList<>();
	for(int i=0;i<list.size();i++) {
		RoleUtil u=new RoleUtil();
		u.setId(list.get(i).getId());
		u.setRoleName(list.get(i).getRoleName());
		if(list.get(i).getRoleType()==1) {
			u.setRoleType("超级管理员");
		}else if(list.get(i).getRoleType()==2) {
			u.setRoleType("普通管理员");
		}else {
			u.setRoleType("用户");
		}
		String str="";
		List<MenuBean> list2=list.get(i).getList();
		if(list2.size()<1) {
			u.setList("该角色拥有所有权限");
		}else {
			for(int j=0;j<list2.size();j++) {
				if(j!=list2.size()-1) {
					str+=list2.get(j).getMenuName()+"、";
				}else {
					str+=list2.get(j).getMenuName();
				}
				
			}
		}
		if(str=="") {
			u.setList("该角色拥有所有权限");
		}else {
			u.setList(str);
		}
		
		list1.add(u);
		
	}
	DataGrid dataGrid = new DataGrid((long) (powerMapper.findAllRole().size()), list1);
	return dataGrid;
	
	}
	
	/**
	 * 角色选择菜单
	 * @param id
	 */
	@RequestMapping(value="/choice",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public void  choiceMenu(String menu,String name,String type) {
	RoleBean bean1=new RoleBean();
	bean1.setRoleName(name);
	bean1.setRoleType(Integer.parseInt(type));
	String[] arr=menu.split(",");
	List<MenuBean>  list=new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		MenuBean  bean=menuMapper.getMenuByName(arr[i]);
		list.add(bean);
	}
	
	if(bean1.getRoleType()==1) {
		list=null;
	}
	powerHandleServiceImpl.roleChoicePower(bean1, list);
	}
	
	/**
	 * 修改角色的信息
	 * @param menu
	 * @param name
	 * @param type
	 * @param roleId
	 */
	@RequestMapping(value="/updateRole",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public void  choiceMenu1(String menu,String name,String type,long roleId) {
	String[] arr=menu.split(",");
	List<MenuBean>  list=new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		MenuBean  bean=menuMapper.getMenuByName(arr[i]);
		list.add(bean);
	}
	RoleBean bean1=new RoleBean();
	bean1.setRoleName(name);
	bean1.setRoleType(Integer.parseInt(type));
	bean1.setId(roleId);
	if(bean1.getRoleType()==1) {
		list=null;
	}
	bean1.setList(list);
	powerHandleServiceImpl.updateRolePower(bean1);
	}
	

	/**
	 * 删除角色
	 * @param 
	 */
	@RequestMapping(value="/deleRole",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public void  addMenu(long roleId){
		powerHandleServiceImpl.deleteRoleById(roleId);

	}
}
