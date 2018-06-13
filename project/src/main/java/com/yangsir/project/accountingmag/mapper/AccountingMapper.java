package com.yangsir.project.accountingmag.mapper;

import com.yangsir.project.beans.YearUseBean;

import java.util.List;

import com.yangsir.project.beans.DayUseBean;
import com.yangsir.project.beans.MonthUseBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:34
 */
public interface AccountingMapper {

	public int countAllDuratingOfMonth();

	public List findAllDuratingOfMonth();

}