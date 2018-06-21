package com.yangsir.project.powermag.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.TreeNode;
import com.yangsir.project.powermag.mapper.MenuMapper;
import com.yangsir.project.utils.TreeUtil;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private MenuMapper menuMapper;
	
	@RequestMapping(value="/get",method= {RequestMethod.POST},produces = { "application/json;charset=utf-8" })
	public List<TreeNode>  findAllMenu(){
		List<MenuBean> list=menuMapper.findAllMenu();
		System.out.println(list);
		System.out.println(TreeUtil.tree(TreeUtil.toListNode(list)));
		return TreeUtil.tree(TreeUtil.toListNode(list));
	}
}
