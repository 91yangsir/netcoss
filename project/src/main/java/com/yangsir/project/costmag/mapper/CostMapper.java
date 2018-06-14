package com.yangsir.project.costmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.data.domain.Page;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.CostBean;

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
	 * 分页查询所有的对象
	 * @return
	 */
	public Page<?> findAllCostBean();
	
	/**
	 * 根据资费id查询所有的使用此资费的业务对象
	 * @param id
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
		@Result(property="business",javaType=Set.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="getBusinessBeanById"))
	})
	@Select("select * from t_cost where id = #{id}")
	public CostBean getCostBeanWithBusinessBeanId(long id);
	@ResultType(BusinessBean.class)
	@Select("select * from t_business where fk_cost_id = #{id}")
	public List<BusinessBean> getBusinessBeanById(long id);

}