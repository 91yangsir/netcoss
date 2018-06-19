package com.yangsir.project.businessmag.mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * 
 * @author dl
 *
 */

public interface BusinessMapper {

	/**
	 * 根据id查询业务
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessState",column="business_state",javaType=Integer.class),
		@Result(property="businessCostNext",column="business_cost_next",javaType=Long.class),
		
		@Result(property="user",column="fk_user_id",javaType=UserBean.class,
		one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.usermag.mapper.UserMapper.getUserById")),
		
		@Result(property="cost",column="fk_cost_id",javaType=CostBean.class,
		one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.costmag.mapper.CostMapper.getCostBeanById")),
	})
	@Select(value= {"select * from t_business where id=#{id}"})
	public BusinessBean getBusinessById(@Param("id")Long id);
	
	
	/**
	 * 根据用户id查询业务信息
	 * @param id
	 * @return 业务集合
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessState",column="business_state",javaType=Integer.class),
		@Result(property="businessCostNext",column="business_cost_next",javaType=Long.class),
		
		@Result(property="cost",column="fk_cost_id",javaType=CostBean.class,
		one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.costmag.mapper.CostMapper.getCostBeanById")),
	})
	@Select(value= {"select * from t_business where fk_user_id=#{id}"})
	public Set<BusinessBean> getBusinessByUserId(@Param("id")Long id);
	
	
	/**
	 * 根据业务名称查询业务详情(资费信息)
	 * @param acc
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessState",column="business_state",javaType=Integer.class),
		@Result(property="businessCostNext",column="business_cost_next",javaType=Long.class),
		
		@Result(property="user",column="fk_user_id",javaType=UserBean.class,
		one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.usermag.mapper.UserMapper.getUserById")),
		
		@Result(property="cost",column="fk_cost_id",javaType=CostBean.class,
		one=@One(fetchType=FetchType.LAZY,select="com.yangsir.project.costmag.mapper.CostMapper.getCostBeanById")),
	})
	@Select(value= {"select * from t_business where business_acc=#{acc}"})
	public BusinessBean getBusinessByAcc(@Param("acc")String acc);
	
	/**
	 * 根据多参数查询业务数量
	 * @param params
	 * @return
	 */
	@SelectProvider(type=BusinessMapperProvider.class,method = "countBusinessByParams")
	public int countBusinessByParams(@Param("params")Map params);
	
	
	/**
	 * 根据参数查询业务，获得集合
	 * @param params
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessState",column="business_state",javaType=Integer.class),
		@Result(property="businessCostNext",column="business_cost_next",javaType=Long.class),
		
		@Result(property="user.userAcc",column="user_acc",javaType=String.class),
		@Result(property="cost.costName",column="cost_name",javaType=String.class),
		@Result(property="server.serverIp",column="server_ip",javaType=String.class),
	})
	@SelectProvider(type=BusinessMapperProvider.class,method = "findBusinessByParams")
	public List<BusinessBean> findBusinessByParams(@Param("params")Map params);
	
}
