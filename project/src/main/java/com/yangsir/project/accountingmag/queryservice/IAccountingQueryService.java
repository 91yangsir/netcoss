package com.yangsir.project.accountingmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.Pager;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 * 账务查询业务层接口
 */
public interface IAccountingQueryService {

	/**
	 * 分页查询账务账号下月时长
	 * @param params 页面数据
	 * @param pager 分页数据
	 * @return 分页对象
	 */
	public Pager findAllDuratingOfMonth2pager(Map params,Pager pager);
	
	/**
	 * 分页查询账务账号下年时长
	 * @param params 页面数据
	 * @param pager 分页数据
	 * @return 分页对象
	 */
	public Pager findAllDuratingOfYear2pager(Map params,Pager pager);
	
	/**
	 * 分页查询业务账号下日时长
	 * @param params 页面数据
	 * @param pager 分页数据
	 * @return 分页对象
	 */
	public Pager findAllDuratingOfDay2pager(Map params,Pager pager);
}