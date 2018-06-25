package com.yangsir.project.servermag.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangsir.project.beans.ServerBean;
import com.yangsir.project.servermag.queryservice.IServerQueryService;

/**
 * 
 * @author dl
 *
 */
@RequestMapping("/server")
@Controller
public class ServerController {

	@Resource
	public IServerQueryService serverQueryServiceImpl;
	
	@ResponseBody
	@RequestMapping(value="/serverCombobox",method= {RequestMethod.GET},produces = { 
	"application/json;charset=utf-8" })
	public List<ServerBean> queryAllServer() {
		
		List<ServerBean> datas = serverQueryServiceImpl.getAllServer();
		return datas;
	}
	
}
