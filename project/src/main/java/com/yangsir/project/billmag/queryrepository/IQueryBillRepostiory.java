package com.yangsir.project.billmag.queryrepository;

import com.yangsir.project.beans.TimeUseBean;

public interface IQueryBillRepostiory {

	public TimeUseBean getMaxUseTimeBill(String account);
}
