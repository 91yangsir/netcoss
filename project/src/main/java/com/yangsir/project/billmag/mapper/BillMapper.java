package com.yangsir.project.billmag.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.TimeUseBean;

public interface BillMapper {
	
	@ResultType(TimeUseBean.class)
	@Select(value = "select id as id,once_money as onceMoney,business_acc as businessAcc,login_time as loginTime,out_time as outTime,use_time as useTime,server_ip as serverIp,server_text as serverText,use_totalTime as totalUseTime,use_cost as cost from t_once_money where business_acc= #{account} order by use_totalTime desc  limit 0,1")
	public TimeUseBean getMaxUseTimeBill(String account);
}
