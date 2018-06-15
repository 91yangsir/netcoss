package com.yangsir.project.managermag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

public class ManagerMapperSqlProvider {

	public String countManagerByParams(Map map) {

		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder(
				"select count(*) from t_manager as m left join t_role as r on m.fk_role_id= r.id where 1=1 ");
		if (params.get("managerName") != null && StringUtils.hasLength(((String) params.get("managerName")).trim())) {
			sb.append("and m.man_name like concat('" + params.get("managerName") + "','%') ");
		}
		if (params.get("managerTel") != null) {
			sb.append("and m.man_tel like concat('" + params.get("managerTel") + "','%') ");
		}
		if (params.get("roleid") != null) {
			sb.append("and r.id ='" + params.get("roleid") + "'");
		}
	
		return sb.toString();

	}      

	public String findManagerByParams(Map map) {

		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder(
				"select*from t_manager as m left join t_role as r on m.fk_role_id= r.id where 1=1 ");
		if (params.get("managerName") != null && StringUtils.hasLength(((String) params.get("managerName")).trim())) {
			sb.append("and m.man_name like concat('" + params.get("managerName") + "','%') ");
		}
		if (params.get("managerTel") != null) {
			sb.append("and m.man_tel like concat('" + params.get("managerTel") + "','%') ");
		}
		if (params.get("roleid") != null) {
			sb.append("and r.id ='" + params.get("roleid") + "'");
		}

		sb.append("limit " + params.get("index") + "," + params.get("rows"));

		return sb.toString();

	}

}
