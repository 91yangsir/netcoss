package com.yangsir.project.usersystemmag.queryservice;

import java.util.Map;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:39
 */
public interface IUsersysQueryService {

	/**
	 * 根据账务账号查询用户信息
	 * @param userAcc
	 * @return
	 */
	public UserBean findUserByUserAcc(String userAcc);
	/***
	 * 分页查询账单信息
	 * @param params
	 * @param pager
	 * @return
	 */
	public Pager findBillBeanByToPager(Map params,Pager pager);
	/**
	 * 根据业务账号查询资费信息
	 * @param businessAcc
	 * @return
	 */
	public CostBean findCostBeanByBusinessAcc(String businessAcc);
	
	/**
	 * 根据业务账号查询服务器信息
	 * @return
	 */
	public ServerInfoBean findServerInfoBeanByBusinessAcc(String businessAcc);
	
	

}