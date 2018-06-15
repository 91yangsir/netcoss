package com.yangsir.project.accountingmag.queryrepository;

import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.YearUseBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 * 账务查询持久层接口
 */
public interface IAccountingQueryRepository {

	/**
	 * 根据参数可以查询月时长对象总数，若有business参数，可查询该业务账号下月时长对象总数
	 * @param params 查询参数
	 * @return 月时长对象总数
	 */
	public int countDuratingOfMonthByParams(Map params);

	/**
	 * 根据参数可以查询月时长对象集合，若有business参数，可查询该业务账号下月时长对象集合
	 * @param params 查询参数
	 * @return 月时长对象集合
	 */
	public List<MonthUseBean> findDuratingOfMonthByParams(Map params);

	/**
	 * 根据参数可以查询日时长对象总数
	 * @param params 查询参数
	 * @return 日时长对象总数
	 */
	public int countDuratingOfDayByParams(Map params);

	/**
	 * 根据参数可以查询日时长对象集合
	 * @param params 查询参数
	 * @return 日时长对象集合
	 */
	public List<DayUseBean> findDuratingOfDayByParams(Map params);
	
	/**
	 * 根据参数可以查询年时长对象总数
	 * @param params 查询参数
	 * @return 年时长对象总数
	 */
	public int countDuratingOfYearByParams(Map params);

	/**
	 * 根据参数可以查询年时长对象集合
	 * @param params 查询参数
	 * @return 年时长对象集合
	 */
	public List<YearUseBean> findDuratingOfYearByParams(Map params);
	
}