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
				sb.append("'"+str+"',");
			}
			sb = sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("month")!=null) {
			sb.append("and month like '"+params.get("month")+"%' ");
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
		StringBuilder sb = new StringBuilder("select * from t_times_month where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append("'"+str+"',");
			}
			sb = sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("month")!=null) {
			sb.append("and month like '"+params.get("month")+"%' ");
		}
		if (params.get("index")!=null&params.get("rows")!=null) {
			sb.append("limit "+params.get("index")+","+params.get("rows"));
		}
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
		if (params.get("business")!=null) {
			sb.append("and business_acc='"+params.get("business")+"' ");
		}
		if (params.get("day")!=null) {
			sb.append("and day like '"+params.get("day")+"%' ");
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
		StringBuilder sb = new StringBuilder("select * from t_times_day where 1=1 ");
		if (params.get("business")!=null) {
			sb.append("and business_acc='"+params.get("business")+"' ");
		}
		if (params.get("day")!=null) {
			sb.append("and day like '"+params.get("day")+"%' ");
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
				sb.append("'"+str+"',");
			}
			sb = sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("day")!=null) {
			sb.append("and year like '"+params.get("year")+"%' ");
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
		StringBuilder sb = new StringBuilder("select * from t_times_year where 1=1 ");
		if (((Set<String>)params.get("business")).size()!=0) {
			sb.append("and business_acc in (");
			Set<String> Set = (Set<String>)params.get("business");
			for (String str : Set) {
				sb.append("'"+str+"',");
			}
			sb = sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append(") ");
		}
		if (params.get("year")!=null) {
			sb.append("and year like '"+params.get("year")+"%' ");
		}
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
	
}
