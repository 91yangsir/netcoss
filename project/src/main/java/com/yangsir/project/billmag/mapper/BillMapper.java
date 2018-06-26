package com.yangsir.project.billmag.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.TimeUseBean;
import com.yangsir.project.beans.UserBean;

public interface BillMapper {
	
	@ResultType(TimeUseBean.class)
	@Select(value = "select id as id,once_money as onceMoney,business_acc as businessAcc,login_time as loginTime,out_time as outTime,use_time as useTime,server_ip as serverIp,server_text as serverText,use_totalTime as totalUseTime,use_cost as cost from t_once_money where business_acc= #{account} order by use_totalTime desc  limit 0,1")
	public TimeUseBean getMaxUseTimeBill(String account);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="billYear",column="bill_year",javaType=Integer.class),
		@Result(property="billMonth",column="bill_month",javaType=Integer.class),
		@Result(property="billMoney",column="bill_money",javaType=Integer.class),
		@Result(property="billType",column="bill_type",javaType=Integer.class),
		@Result(property="billState",column="bill_state",javaType=Integer.class),
		@Result(property="user",column="fk_user_id",javaType=UserBean.class,one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.usermag.mapper.UserMapper.getUserById"))
		
		
	})
	@Select(value="select * from t_bill")
	public List<BillBean> findAll();
	
	@Select(value="select fk_user_id from t_bill where id=#{id}")
	public int findUserId(int id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="business",column="business_acc",javaType=String.class),
		@Result(property="loginTime",column="login_time",javaType=Date.class),
		@Result(property="outTime",column="out_time",javaType=Date.class),
		@Result(property="useTime",column="use_time",javaType=long.class),
		@Result(property="serverIp",column="server_ip",javaType=String.class),
		@Result(property="totalUseTime",column="use_totalTime",javaType=double.class),
		@Result(property="cost",column="use_cost",javaType=Integer.class),
		@Result(property="onceMoney",column="once_money",javaType=double.class),
		@Result(property="serverText",column="server_text",javaType=String.class)
		
		
	})
	@Select(value="select * from t_once_money where  use_month=#{month} and business_acc=#{acc}")
	public List<TimeUseBean> findByPage(@Param("acc")String acc,@Param("month")String month); 
}
