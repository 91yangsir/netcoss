package com.yangsir.project.accountingmag.mapper;

import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.loginlogmag.mapper.LoginLogMapperSqlProvider;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;

import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:34
 */
public interface AccountingMapper {


	/**
	 * 根据参数可以查询月时长对象总数，若有business参数，可查询该业务账号下月时长对象总数
	 * @param params 查询参数
	 * @return 月时长对象总数
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="countDuratingOfMonthByParams")
	public int countDuratingOfMonthByParams(Map params);

	/**
	 * 根据参数可以查询月时长对象集合，若有business参数，可查询该业务账号下月时长对象集合
	 * @param params 查询参数
	 * @return 月时长对象集合
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfMonthByParams")
	public List<MonthUseBean> findDuratingOfMonthByParams(Map params);

	/**
	 * 根据参数可以查询日时长对象总数
	 * @param params 查询参数
	 * @return 日时长对象总数
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="countDuratingOfDayByParams")
	public int countDuratingOfDayByParams(Map params);

	/**
	 * 根据参数可以查询日时长对象集合
	 * @param params 查询参数
	 * @return 日时长对象集合
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfDayByParams")
	public List<DayUseBean> findDuratingOfDayByParams(Map params);
	/**
	 * 根据参数可以查询年时长对象总数
	 * @param params 查询参数
	 * @return 年时长对象总数
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="countDuratingOfYearByParams")
	public int countDuratingOfYearByParams(Map params);

	/**
	 * 根据参数可以查询年时长对象集合
	 * @param params 查询参数
	 * @return 年时长对象集合
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfYearByParams")
	public List<YearUseBean> findDuratingOfYearByParams(Map params);
	

}