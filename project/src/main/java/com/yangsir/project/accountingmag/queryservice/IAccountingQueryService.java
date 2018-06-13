package com.yangsir.project.accountingmag.queryservice;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.YearUseBean;
import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:36
 */
public interface IAccountingQueryService {

	public Pager findAllDuratingOfMonth2pager();

}