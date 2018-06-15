package com.yangsir.project.costmag.mapper;

import java.util.Map;

import com.yangsir.project.beans.Pager;

public class CostMapperSqlProvider {
	public String getCostByMapToPager(Map<String,Object> params) {
		Pager pager = (Pager) params.get("cost");
		StringBuilder sb = new StringBuilder("select * from t_cost where 1=1 ");
		int index = pager.getIndex();
		int rows = pager.getRows();
		sb.append("order by id desc limit "+index+","+rows+"");
		return sb.toString();
	}
}
