package com.yangsir.project.businessmag.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;

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
	})
	@Select(value= {"select * from t_business where id=#{id}"})
	public BusinessBean getBusinessById(Long id);
	
	
	/**
	 * 分页查询业务
	 * @param map
	 * @return
	 */
	public Pager findBusiness2PageByMap(Map map);
	
}
