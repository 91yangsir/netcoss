package com.yangsir.project.accountingmag.mapper;

import java.util.Map;
import java.util.Set;

/**
 * 
 * @author guoqi
 * AccountingMapperSql提供类
 */
public class AccountingMapperSqlProvider {

	/**
	 * 账务查询mapper方法countDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countDuratingOfMonthByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_month where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and month >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and month <= '"+params.get("endTime")+"' ");
		}
		
		return sb.toString();
	}
	
	/**
	 * 账务查询mapper方法findDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findDuratingOfMonthByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_month where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and month >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and month <= '"+params.get("endTime")+"' ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
	
	/**
	 * 账务查询mapper方法countDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countDuratingOfDayByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_day where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and day >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and day <= '"+params.get("endTime")+"' ");
		}
		
		return sb.toString();
	}
	
	/**
	 * 账务查询mapper方法findDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findDuratingOfDayByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_day where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and day >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and day <= '"+params.get("endTime")+"' ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
	
	
	/**
	 * 账务查询mapper方法countDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countDuratingOfYearByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_year where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and year >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and year <= '"+params.get("endTime")+"' ");
		}
		
		return sb.toString();
	}
	
	/**
	 * 账务查询mapper方法findDuratingOfMonthByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findDuratingOfYearByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_times_year where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append(str+",");
			}
			sb.substring(0, sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and year >= '"+params.get("startTime")+"' ");
		}
		if (params.get("endTime")!=null) {
			sb.append("and year <= '"+params.get("endTime")+"' ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
	
}
