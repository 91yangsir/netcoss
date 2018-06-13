package com.yangsir.project.accountingmag.queryrepository;


import java.util.List;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:36
 */
public interface IAccountingQueryRepository {

	public int countAllDuratingOfMonth();

	public List<?> findAllDuratingOfMonth();

}