package com.yangsir.project.managermag.controller;

import com.yangsir.project.managermag.handleservice.IManagerHandleService;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;
import com.yangsir.project.viewobject.DataGrid;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */

@RequestMapping("/manager")
@Controller
public class ManagerController {
	@Resource
	public IManagerHandleService managerHandleServiceImpl;

	@Resource
	public IManagerQueryService managerQueryServiceImpl;
	
	
	
	

	/**
	 * 分頁展示
	 */
	
	
	@RequestMapping(value = "/page", method = { RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public DataGrid showManagerToPager(Pager pager, String managerName, String managerTel, String roleName) {

		Map<String, Object> params = new HashMap<>();
		params.put("managerName", managerName);
		params.put("managerTel", managerTel);
		
		//RoleBean role = managerQueryServiceImpl.getRoleBeanByName(roleName);
		params.put("role", roleName);
		
		Pager p=managerQueryServiceImpl.findManagerByParams2Pager(params, pager);
		System.out.println(p);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}

	/**
	 * 增加用户
	 */
	
	@RequestMapping(value = "/add", method = {RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public ModelAndView Addmanager(ManagerBean manager ) {
			
		if (manager!=null) {
			managerHandleServiceImpl.saveManager(manager);
		}
		ModelAndView  mo =new ModelAndView();
		   mo.setViewName("managermag/managerindex");

		return   mo;

	}

	/**
	 * 
	 */
	@RequestMapping(value = "/update", method = {RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	public ModelAndView UpdateManager(Integer id) {
		System.out.println(id);
		
		  ManagerBean manager = managerQueryServiceImpl.getManger(id);
		  ModelAndView modelAndView =new ModelAndView();
		  modelAndView.setViewName("managermag/updateManager");
		  modelAndView.addObject("manager",manager);
		 

		return modelAndView;

	}
	
	/**
	 * 
	 * @param manager  修改提交
	 * @return
	 */
	@RequestMapping(value = "/update1", method = {RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	public ModelAndView UpdateManager(ManagerBean manager) {
		
		
		 	managerHandleServiceImpl.updateManatger(manager);
		  ModelAndView modelAndView =new ModelAndView();
		  modelAndView.setViewName("managermag/managerindex");
		

		return modelAndView;

	}
	/**
	 * 刪除用戶
	 */

}