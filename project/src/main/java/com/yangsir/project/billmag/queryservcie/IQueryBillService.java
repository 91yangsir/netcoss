package com.yangsir.project.billmag.queryservcie;

import java.util.List;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.MonthUseBean;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.beans.TimeUseBean;

public interface IQueryBillService {
	/**
	 * 
	 * @param account 传入的业务账号名称
	 * @return 返回的是具有最大使用时间的TimeUseBean，便于统计使用总时长
	 */
	public TimeUseBean getMaxUseTimeBill(String account);
	/**
	 * 查询所有的账单集合
	 * @return
	 */
	public List<BillBean> findAll();
	
	/**
	 * 查询菜单分页的数据
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<BillBean> findByPage(int page,int rows);
	/**
	 * 查询账务账号下所有业务账号的账单
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<MonthUseBean> findByPage1(int page,int rows,int id);
}
