package com.yangsir.project.usersystemmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

public class UsersysMapperSqlProvider {
	/**
	 * 账单分页mapper方法countBillByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countBillByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_bill where 1=1 ");
		if (params.get("billMonth")!=null&&StringUtils.hasLength(((String)params.get("billMonth")).trim())) {
			sb.append("and bill_month like concat('"+params.get("billMonth")+"','%') ");
		}
		
		return sb.toString();
	}
	
	
	/**
	 * 账单分页mapper方法findBillByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findBillByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_bill where 1=1 ");
		if (params.get("billMonth")!=null&&StringUtils.hasLength(((String)params.get("billMonth")).trim())) {
			sb.append("and bill_month like concat('"+params.get("billMonth")+"','%') ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
}
