package com.yangsir.project.billmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

public class BillMapperSqlProvider {

	public String findBillByParam(Map map) {
		
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_bill b left join t_user u on b.fk_user_id=u.id where 1=1 ");
		if (params.get("userAcc") != null && StringUtils.hasLength(((String) params.get("userAcc")).trim())) {
			sb.append(" and u.user_name like concat('" + params.get("userAcc") + "','%') ");
		}
		
		if (params.get("idCard") != null && StringUtils.hasLength(((String) params.get("idCard")).trim())) {
			sb.append(" and u.user_card like concat('" + params.get("idCard") + "','%') ");
		}
		
		if (params.get("month") != null && StringUtils.hasLength(((String) params.get("month")).trim())) {
			sb.append(" and  b.bill_month = "+  params.get("month"));
		}

		if (params.get("year") != null && StringUtils.hasLength(((String) params.get("year")).trim())) {
			sb.append(" and  b.bill_year = "+  params.get("year"));
		}
		return sb.toString();
	}
}
