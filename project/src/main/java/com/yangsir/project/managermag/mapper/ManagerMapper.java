
package com.yangsir.project.managermag.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */
public interface ManagerMapper {

	/**
	 * 
	 * @param id  根据id 查询  管理员
	 */
	//查询客户
		@Results({
			@Result(id=true,property="id",column="id",javaType=Long.class),
			@Result(property="managerAcc",column="man_mail",javaType=String.class),
			@Result(property="managerName",column="man_name",javaType=String.class),
			@Result(property="managerPwd",column="man_pwd",javaType=String.class),
			@Result(property="managerTel",column="man_tel",javaType=String.class),
			@Result(property="managerMail",column="man_mail",javaType=String.class)
			
			
		})
	@Select("select*from t_manager where id=#{id}")
	public ManagerBean getManager(long id);

	/**
	 * 
	 * @param map
	 */
	public ManagerBean getManagerByMap(Map map);

}