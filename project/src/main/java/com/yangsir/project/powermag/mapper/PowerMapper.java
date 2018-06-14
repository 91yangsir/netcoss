package com.yangsir.project.powermag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.RoleBean;

/**
 * @author xiongbing
 * @version 1.0
 * @created 
 */
public interface PowerMapper {
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="roleName",column="role_name",javaType=String.class),
		@Result(property="roleType",column="role_type",javaType=Integer.class),
		@Result(property="list",column="id",javaType=List.class,many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.powermag.mapper.MenuMapper.getMenuById1"))
		
		
	})
	@ResultType(RoleBean.class)
	@Select(value= {"select * from t_role"})
	public List<RoleBean> findAllRole();
	
	
	@ResultType(RoleBean.class)
	@Select(value = "select id as id,role_name as roleName,role_type as roleType from t_role where role_name = #{name}")
	public RoleBean findRoleByName(String name);
	
	@ResultType(RoleBean.class)
	@Select(value = "select id as id,role_name as roleName,role_type as roleType from t_role where id = #{id}")
	public RoleBean findRoleById(long id);
	
	
	@ResultType(RoleBean.class)
	@Select(value = "select r.id as id,role_name as roleName,role_type as roleType from t_role as r left join t_power as p on r.id = p.fk_role_id where p.fk_menu_id = #{id}")
	public RoleBean findRoleById1(long id);
	
	
	
}