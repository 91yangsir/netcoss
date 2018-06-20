package com.yangsir.project.powermag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.MenuBean;

public interface MenuMapper {
	@ResultType(MenuBean.class)
	@Select(value = "select id as id,menu_name as menuName,menu_num as menuNum,menu_level as menuLevel from t_menu where id = #{id}")
	public MenuBean getMenuById(long id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="menuName",column="menu_name",javaType=String.class),
		@Result(property="menuNum",column="menu_num",javaType=String.class),
		@Result(property="menuLevel",column="menu_level",javaType=Integer.class),
		@Result(property="list",column="id",javaType=List.class,many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.powermag.mapper.PowerMapper.findRoleById1"))
		
		
	})
	@Select(value = "select * from t_menu where menu_name = #{name}")
	public MenuBean getMenuByName(String name);
	
	@Select("select m.id as id,menu_name as menuName,menu_num as menuNum,menu_level as menuLevel from t_menu as m left join t_power as p on m.id = p.fk_menu_id where p.fk_role_id = #{id}")
	public MenuBean getMenuById1(long id);
}
