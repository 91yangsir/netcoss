package com.yangsir.project.usermag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;


public class UserMapperProvider {
	
	public String countUserByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(id) from t_user where 1=1");
		
		if (params.get("userName")!=null&&StringUtils.hasLength(((String)params.get("userName")).trim())) {
			sb.append("and user_name like concat('"+params.get("userName")+"','%') ");
		}
		if (params.get("userAcc")!=null&&StringUtils.hasLength(((String)params.get("userAcc")).trim())) {
			sb.append("and user_acc = '"+params.get("userAcc")+"' ");
		}
		return sb.toString();
	}
	
	
	public String findUserByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
StringBuilder sb = new StringBuilder("select count(id) from t_user where 1=1");
		
		if (params.get("userName")!=null&&StringUtils.hasLength(((String)params.get("userName")).trim())) {
			sb.append("and user_name like concat('"+params.get("userName")+"','%') ");
		}
		if (params.get("userAcc")!=null&&StringUtils.hasLength(((String)params.get("userAcc")).trim())) {
			sb.append("and user_acc = '"+params.get("userAcc")+"' ");
		}
		sb.append("limit"+params.get("index")+","+params.get("rows"));
		
		return sb.toString();
	}
	

	
	 
}
