package com.yangsir.project.powermag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

public class PowerMapperProvider {

	public String findRoleByParam(Map map) {

		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_role  where 1=1 ");
		if (params.get("manager") != null && StringUtils.hasLength(((String) params.get("manager")).trim())) {
			sb.append(" and role_name like concat('" + params.get("manager") + "','%') ");
		}
		sb.append(" and role_type = " + params.get("type"));
		
		return sb.toString();
	}
}
