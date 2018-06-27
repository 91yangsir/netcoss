package com.yangsir.project.usermag.controller;

import com.yangsir.project.usermag.handleservice.IUserHandleService;
import com.yangsir.project.usermag.queryservice.IUserQueryService;
import com.yangsir.project.viewobject.DataGrid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@Resource
	public IUserHandleService userHandleServiceImpl;
	@Resource
	public IUserQueryService userQueryServiceImpl;

	/**
	 * 添加用户
	 * @param user 用户信息
	 * @return
	 */
	@RequestMapping(value="/save",method= {RequestMethod.POST}, produces = {
	"application/json;charset=utf-8" })
	public String saveUser(UserBean user) {
		try {
			userHandleServiceImpl.saveUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/view/usermag/showuser.ftl";
	}
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/delete",method= {RequestMethod.DELETE})
	public String deleteUser(UserBean user) {
		try {
			userHandleServiceImpl.deleteUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "";
	}
	
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/update",method= {RequestMethod.GET})
	public ModelAndView updateUser(Long id) {
		UserBean user = userQueryServiceImpl.getUserById(id);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("usermag/updateuser");
		modelAndView.addObject("user", user);
//		System.out.println(user);
		return modelAndView;
	}
	
	@RequestMapping(value="/update1",method= {RequestMethod.POST}, produces = {
	"application/json;charset=utf-8" })
	public String updateUser1(UserBean user,Long roleId) {
//		System.out.println(user);
//		System.out.println(roleId);
		try {
			RoleBean roleBean = new RoleBean();
			roleBean.setId(roleId);
			user.setRole(roleBean);
			userHandleServiceImpl.updateUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/view/usermag/showuser.ftl";
	}
	
	
	/**
	 * 得到用户账务信息分页数据
	 * @param pager 分页对象
	 * @param userName 用户姓名
	 * @param userAcc 账务账号
	 * @return 分页展示数据
	 */
	@ResponseBody
	@RequestMapping(value="/showPage",method= {RequestMethod.GET},produces = { 
			"application/json;charset=utf-8" })
	public DataGrid findUser2Page(Pager pager,String userName,String userAcc) {
		Map params = new HashMap();
		params.put("userName", userName);
		params.put("userAcc", userAcc);
		
		try {
			pager = userQueryServiceImpl.findUser2PageByMap(params, pager);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		System.out.println(pager);
		DataGrid dataGrid = new DataGrid((long)pager.getTotalRows(),pager.getDatas());
		return dataGrid;
	}
	
	@ResponseBody
	@RequestMapping(value="/userCombobox",method= {RequestMethod.GET},produces = { 
	"application/json;charset=utf-8" })
	public List<UserBean> queryAllUser() {
		
		List<UserBean> datas = (List<UserBean>) userQueryServiceImpl.getAllUser();
		
		return datas;
	}


}