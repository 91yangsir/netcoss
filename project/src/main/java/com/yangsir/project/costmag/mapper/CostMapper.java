package com.yangsir.project.costmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.data.domain.Page;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;
import com.yangsir.project.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:35
 */
public interface CostMapper {

	/**
	 * 通过id查询对象
	 * @param id
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
	})
	@Select("select * from t_cost where id = #{id}")
	public CostBean getCostBeanById(long id);

	/**
	 * 分页查询所有的资费对象总个数
	 * @return
	 */
	@Select("select count(*) from t_cost")
	public int getCostBeanNums();
	
	/**
	 * 查询所有的资费对象
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
	})
	@Select("select * from t_cost")
	public List<CostBean> getFindAllCostBean();
	
	/**
	 * 根据资费id查询所有的使用此资费的业务对象
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=long.class),
		@Result(id=true,property="businessAcc",column="business_acc",javaType=String.class),
		@Result(id=true,property="businessPwd",column="business_pwd",javaType=String.class),
 	})
	@Select("select * from t_business where fk_cost_id = #{id}")
	public List<BusinessBean> getBusinessBeanById(long id);

	/**
	 * 分页显示资费业务对象
	 * @param page
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="costName",column="cost_name"),
		@Result(property="costType",column="cost_type"),
		@Result(property="costTime",column="cost_time"),
		@Result(property="costBase",column="cost_base"),
		@Result(property="costUnit",column="cost_unit"),
		@Result(property="costStart",column="cost_start"),
		@Result(property="costExplain",column="cost_explain")
	})
	@SelectProvider(type=CostMapperSqlProvider.class,method="getCostByMapToPager")
	public List<CostBean> getCostByMapToPager(@Param("cost")Pager page);
	/**
	 * 通过资费id查询使用此资费的个数
	 * @param id
	 * @return
	 */
	@Select("select count(*) from t_business where fk_cost_id")
	public int getCostBeanByBusinessBeanNums(long id);
	
	
	/**
	 * 查询所有已开通（有开通时间）的资费
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
	})
	@Select("select * from t_cost where cost_start is not null")
	public List<CostBean> getFindStartNoNull();
}