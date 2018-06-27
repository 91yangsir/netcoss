package com.yangsir.project.powermag.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.TreeNode;
import com.yangsir.project.powermag.handleservice.IMenuHandleServcie;
import com.yangsir.project.powermag.handleservice.impl.PowerHandleServiceImpl;
import com.yangsir.project.powermag.mapper.MenuMapper;
import com.yangsir.project.utils.MenuUtil;
import com.yangsir.project.utils.TreeUtil;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private MenuMapper menuMapper;
	@Resource
	private IMenuHandleServcie menuHandleServiceImpl;
	@Resource
	private PowerHandleServiceImpl powerHandleServiceImpl;
	/**
	 * 查询属性菜单结构的json
	 * @return 
	 */
	@RequestMapping(value="/get",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public List<TreeNode>  findAllMenu(){
		
		List<MenuBean> list=menuMapper.findAllMenu();
		System.out.println(TreeUtil.toListNode(list));
		return TreeUtil.tree(TreeUtil.toListNode(list));
	}
	
	/**
	 * 提供给下拉框的json
	 * @return
	 */
	@RequestMapping(value="/get1",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public List<MenuUtil>  findAllMenu1(){
		
		List<MenuBean> list=menuMapper.findAllMenu();
		List<MenuUtil> list1=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			MenuUtil menu=new MenuUtil();
			if(i==0) {
				menu.setSelected(true);
			}
			menu.setId(list.get(i).getId());
			menu.setText(list.get(i).getMenuName());
			list1.add(menu);
		}
		return list1;
	}
	/**
	 * 增加菜单
	 * @param menu
	 */
	@RequestMapping(value = "/{id}", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public void addMenu(MenuBean menu) {
		menuHandleServiceImpl.addMenu(menu);

	}
	/**
	 * 修改菜单
	 * @param id
	 * @param menuName
	 */
	@RequestMapping(value="/update",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public void  updateMenu(String id,String menuName){
		MenuBean bean=menuMapper.getMenuById(Long.parseLong(id));
		bean.setMenuName(menuName);
		menuHandleServiceImpl.updateMenu(bean);
	}
	/**
	 * 删除菜单
	 * @param id
	 */
	@RequestMapping(value="/dele",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public void  deleMenu(String id) {
		menuHandleServiceImpl.deleteMenu(Long.parseLong(id));
		
	}
}
