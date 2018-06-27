package com.yangsir.project.managermag.controller;

import com.yangsir.project.managermag.handleservice.IManagerHandleService;
import com.yangsir.project.managermag.queryservice.IManagerQueryService;
import com.yangsir.project.powermag.queryrepository.impl.PowerQueryRepositoryImpl;
import com.yangsir.project.powermag.queryservice.IPowerQueryService;
import com.yangsir.project.viewobject.DataGrid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
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

	@Resource
	private IPowerQueryService powerQueryServiceImpl;

	/**
	 * 分頁展示
	 */

	@RequestMapping(value = "/page", method = { RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	@ResponseBody
	public DataGrid showManagerToPager(Pager pager, String managerName, String managerTel, String roleName) {

		Map<String, Object> params = new HashMap<>();
		params.put("managerName", managerName);
		params.put("managerTel", managerTel);

		RoleBean role = managerQueryServiceImpl.getRoleBeanByName(roleName);
		params.put("roleName", roleName);

		Pager p = managerQueryServiceImpl.findManagerByParams2Pager(params, pager);
		System.out.println(p);
		DataGrid dataGrid = new DataGrid((long) pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}

	/**
	 * 增加用户
	 */

	@ResponseBody
	@RequestMapping(value = "/add", method = { RequestMethod.POST }, produces = { "application/json;charset=utf-8" })
	public ManagerBean  Addmanager(ManagerBean manager, String roleName) {

		RoleBean roleBean = powerQueryServiceImpl.findRoleByName(roleName);
		RoleBean role = new RoleBean();
		String manName=manager.getManagerName();
		String  password=manager.getManagerPwd();
		String hashAlgorithmName = "MD5";
		Object credentials = password;
		Object salt = ByteSource.Util.bytes(manName);
		int hashIterations = 1024;
		Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
		System.out.println(result);
		manager.setManagerPwd(result.toString());
		role.setId(roleBean.getId());

		manager.setRole(role);
		managerHandleServiceImpl.saveManager(manager);

		

		return manager;

	}

	/**
	 * 修改用户
	 */
	@RequestMapping(value = "/update", method = { RequestMethod.GET }, produces = { "application/json;charset=utf-8" })
	public ModelAndView UpdateManager(Integer id) {
		System.out.println(id);

		ManagerBean manager = managerQueryServiceImpl.getManger(id);
		System.out.println(manager);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("managermag/updateManager");
		modelAndView.addObject("manager", manager);

		return modelAndView;

	}

	/**
	 * 
	 * @param manager
	 *            修改提交
	 * @return
	 */
	@RequestMapping(value = "/update1", method = { RequestMethod.POST }, produces = {"application/json;charset=utf-8" })
	public ModelAndView updateManager(ManagerBean manager, String roleName) {
		//System.out.println(manager.getId());
		ManagerBean  manager2=new ManagerBean();
		manager2.setId(manager.getId());
		manager2.setManagerAcc(manager.getManagerAcc());
		manager2.setManagerName(manager.getManagerName());
		manager2.setManagerPwd(manager.getManagerPwd());
		manager2.setManagerTel(manager.getManagerTel());
		manager2.setManagerMail(manager.getManagerMail());
		RoleBean roleBean = powerQueryServiceImpl.findRoleByName(roleName);
		RoleBean role =new RoleBean();
		role.setId(roleBean.getId());
		role.setRoleName(roleBean.getRoleName());
		
		manager2.setRole(role);
		managerHandleServiceImpl.updateManatger(manager2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("managermag/managerindex");

		return modelAndView;

	}
	/**
	 * 刪除用戶
	 */
	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE })
	public ModelAndView  deleteManager( Integer id) {
		System.out.println(id);
		managerHandleServiceImpl.deleteManager(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("managermag/managerindex");
		return modelAndView;
		
	}
	
	/**
	 * 查询角色名称
	 */
	@ResponseBody
	@RequestMapping(value = "/rolelist", method = { RequestMethod.GET}, produces = {"application/json;charset=utf-8" })
	public List<RoleBean>  findRoleBean(){
		
		List<RoleBean> findAllRole = powerQueryServiceImpl.findAllRole();
		
		return findAllRole;
		
	}
}