package com.yangsir.project.powermag.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.MenuBean;

public interface MenuMapper {
	@ResultType(MenuBean.class)
	@Select(value = "select id as id,menu_name as menuName,menu_num as menuNum,menu_level as menuLevel from t_menu where id = #{id}")
	public MenuBean getMenuById(long id);
}
