package com.yangsir.project.loginlogmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * 登陆日志mapper方法的提供类
 * 
 * @author guoqi
 *
 */
public class LoginLogMapperSqlProvider {

	/**
	 * 登陆日志mapper方法countLoginLogByParams的提供类
	 * 
	 * @param map
	 *            参数
	 * @return sql
	 */
	public String countLoginLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_login_log where 1=1 ");
		if (params.get("manager") != null && StringUtils.hasLength(((String) params.get("manager")).trim())) {
			sb.append("and manager_name like concat('" + params.get("manager") + "','%') ");
		}
		if ((int)params.get("type") >=0) {
			sb.append("and login_log_type=" + params.get("type") + " ");
		}
		if (params.get("startTime")!=null&&StringUtils.hasLength(((String)params.get("startTime")).trim())) {
			sb.append("and login_log_time >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null&&StringUtils.hasLength(((String)params.get("endTime")).trim())) {
			sb.append("and login_log_time <= '"+params.get("endTime")+"' ");
		}
		return sb.toString();
	}

	/**
	 * 登陆日志mapper方法findLoginLogByParams的提供类
	 * 
	 * @param map
	 *            参数
	 * @return sql
	 */
	public String findLoginLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_login_log where 1=1 ");
		if (params.get("manager") != null && StringUtils.hasLength(((String) params.get("manager")).trim())) {
			sb.append("and manager_name like concat('" + params.get("manager") + "','%') ");
		}
		if ((int)params.get("type") >=0) {
			sb.append("and login_log_type=" + params.get("type") + " ");
		}
		if (params.get("startTime")!=null&&StringUtils.hasLength(((String)params.get("startTime")).trim())) {
			sb.append("and login_log_time >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null&&StringUtils.hasLength(((String)params.get("endTime")).trim())) {
			sb.append("and login_log_time <= '"+params.get("endTime")+"' ");
		}
		sb.append("order by login_log_time desc ");
		sb.append("limit " + params.get("index") + "," + params.get("rows"));
		return sb.toString();
	}

}
