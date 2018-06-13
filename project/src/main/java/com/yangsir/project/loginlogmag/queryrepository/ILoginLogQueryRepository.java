package com.yangsir.project.loginlogmag.queryrepository;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6ÔÂ-2018 16:34:37
 */
public interface ILoginLogQueryRepository {

	public int countLoginLogByParams();

	public List findLoginLogByParams();

}