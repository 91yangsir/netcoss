package com.yangsir.project.usersystemmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.BillBean;
import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.ServerInfoBean;
import com.yangsir.project.beans.UserBean;
import com.yangsir.project.loginlogmag.mapper.LoginLogMapperSqlProvider;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:43
 */
public interface UsersysMapper {
	/**
	 * 根据账务账号查询用户信息
	 * @param userAcc
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=int.class),
		@Result(property="userCard",column="user_card",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userQQ",column="user_qq",javaType=String.class),
		@Result(property="business",javaType=Set.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="getBusinessByUserId"))
	})
	@Select("select * from t_user where user_acc = #{userAcc}")
	public UserBean findUserByUserAcc(String userAcc);
	/**
	 * 根据userid查询业务信息
	 * @param id
	 * @return
	 */
	@ResultType(BusinessBean.class)
	@Select("select * from t_business where fk_user_id = #{id}")
	public List<BusinessBean> getBusinessByUserId(long id);
	/**
	 * 根据参数查询账单总数
	 * @param params 页面参数
	 * @return 
	 */
	@SelectProvider(type=UsersysMapperSqlProvider.class,method="countBillByParams")
	public int countBillByParams(@Param("params")Map params);
	
	/**
	 * 根据参数查询账单
	 * @param params 页面参数
	 * @return 
	 */
	@Results({
			@Result(id=true,property="id",column="id",javaType=Long.class),
			@Result(property="billYear",column="bill_year",javaType=Integer.class),
			@Result(property="billMonth",column="bill_month",javaType=Integer.class),
			@Result(property="billMoney",column="bill_money",javaType=Double.class),
			@Result(property="billType",column="bill_type",javaType=String.class),
			@Result(property="billState",column="bill_state",javaType=String.class),
	})
	@SelectProvider(type=UsersysMapperSqlProvider.class,method="findBillByParams")
	public List<BillBean> findBillByParams(@Param("params")Map params);
	
	/**
	 * 根据业务账号查询服务器信息
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=long.class),
		@Result(property="serverInTime",column="server_in_time",javaType=Date.class),
		@Result(property="serverOutTime",column="server_out_time",javaType=int.class),
		@Result(property="serverUseTime",column="server_user_time",javaType=String.class),
		@Result(property="serverIp",column="server_ip",javaType=String.class),
		@Result(property="bussinesAcc",column="business_acc",javaType=String.class),
	})
	@Select("select * from t_server_info where business_acc = #{businessAcc}")
	public ServerInfoBean findServerInfoBeanByBusinessAcc(String businessAcc);
	
	/**
	 * 根据业务账号查询资费信息
	 * @param businessAcc
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=long.class),
		@Result(property="costName",column="cost_name",javaType=String.class),
		@Result(property="costType",column="cost_type",javaType=int.class),
		@Result(property="costTime",column="cost_time",javaType=int.class),
		@Result(property="costBase",column="cost_base",javaType=double.class),
		@Result(property="costUnit",column="cost_unit",javaType=double.class),
		@Result(property="costStart",column="cost_start",javaType=Date.class),
		@Result(property="costExplain",column="cost_explain",javaType=String.class),
		@Result(property="business",javaType=Set.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="getBusinessByCostId"))
	})
	@Select("select * from t_cost where business.businessAcc = #{businessAcc}")
	public CostBean findCostBeanByBusinessAcc(String businessAcc);
	/**
	 * 根据costid查询业务信息
	 * @param id
	 * @return
	 */
	@ResultType(BusinessBean.class)
	@Select("select * from t_business where fk_cost_id = #{id}")
	public List<BusinessBean> getBusinessByCostId(long id);
}