package com.yangsir.project.businessmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

public class BusinessMapperProvider {

	public String countBusinessByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(b.id) from t_business b,t_user u where b.fk_user_id=u.id ");
		
		if (params.get("userAcc")!=null&&StringUtils.hasLength(((String)params.get("userAcc")).trim())) {
			sb.append("and u.user_acc = '"+params.get("userAcc")+"' ");
		}
		if (params.get("businessAcc")!=null&&StringUtils.hasLength(((String)params.get("businessAcc")).trim())) {
			sb.append("and b.business_acc = '"+params.get("businessAcc")+"' ");
		}
		
		return sb.toString();
	}
	
	
	public String findBusinessByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder(
				"select b.id as id,b.business_acc as business_acc,b.business_pwd as business_pwd,b.business_state as business_state,b.business_cost_next as business_cost_next,u.user_acc as user_acc,c.cost_name as cost_name,s.server_ip as server_ip "
				+ "from t_business b,t_user u,t_server s,t_cost c where b.fk_user_id=u.id and b.fk_cost_id=c.id and b.fk_server_id = s.id ");
		
		if (params.get("userAcc")!=null&&StringUtils.hasLength(((String)params.get("userAcc")).trim())) {
			sb.append("and user_acc = '"+params.get("userAcc")+"' ");
		}
		if (params.get("businessAcc")!=null&&StringUtils.hasLength(((String)params.get("businessAcc")).trim())) {
			sb.append("and business_acc = '"+params.get("businessAcc")+"' ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		
		return sb.toString();
	}
	
	
	
}
