package com.yangsir.project.accountingmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.YearUseBean;

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
	public int countDuratingOfMonthByParams(@Param("params")Map params);

	/**
	 * 根据参数可以查询月时长对象集合，若有business参数，可查询该业务账号下月时长对象集合
	 * @param params 查询参数
	 * @return 月时长对象集合
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="monthTime",column="month_time",javaType=Double.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="month",column="month",javaType=String.class),
		@Result(property="serverIP",column="server_ip",javaType=String.class),
		@Result(property="monthMoney",column="month_money",javaType=Double.class)
	})
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfMonthByParams")
	public List<MonthUseBean> findDuratingOfMonthByParams(@Param("params")Map params);

	/**
	 * 根据参数可以查询日时长对象总数
	 * @param params 查询参数
	 * @return 日时长对象总数
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="countDuratingOfDayByParams")
	public int countDuratingOfDayByParams(@Param("params")Map params);

	/**
	 * 根据参数可以查询日时长对象集合
	 * @param params 查询参数
	 * @return 日时长对象集合
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="dayTime",column="day_time",javaType=Double.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="day",column="day",javaType=String.class),
		@Result(property="serverIP",column="server_ip",javaType=String.class),
		@Result(property="dayMoney",column="day_money",javaType=Double.class)
	})
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfDayByParams")
	public List<DayUseBean> findDuratingOfDayByParams(@Param("params")Map params);
	/**
	 * 根据参数可以查询年时长对象总数
	 * @param params 查询参数
	 * @return 年时长对象总数
	 */
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="countDuratingOfYearByParams")
	public int countDuratingOfYearByParams(@Param("params")Map params);

	/**
	 * 根据参数可以查询年时长对象集合
	 * @param params 查询参数
	 * @return 年时长对象集合
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="yearTime",column="year_time",javaType=Double.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="year",column="year",javaType=String.class),
		@Result(property="serverIP",column="server_ip",javaType=String.class)
	})
	@SelectProvider(type=AccountingMapperSqlProvider.class,method="findDuratingOfYearByParams")
	public List<YearUseBean> findDuratingOfYearByParams(@Param("params")Map params);
	

}