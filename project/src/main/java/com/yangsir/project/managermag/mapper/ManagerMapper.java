
package com.yangsir.project.managermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.loginlogmag.mapper.LoginLogMapperSqlProvider;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:40
 */
public interface ManagerMapper {
	
	@ResultType(RoleBean.class)
	@Select("select id as id , role_name  as name from t_role where role_name=#{roleName}")
	public  RoleBean  getRoleBeanByName(@Param("roleName") String roleName);
	/**
	 * 
	 * @param id
	 *            根据id 查询 管理员 以及管理员的角色
	 */
	// 查询客户
	@Results({ @Result(id = true, property = "id", column = "id", javaType = Long.class),
			@Result(property = "managerAcc", column = "man_acc", javaType = String.class),
			@Result(property = "managerName", column = "man_name", javaType = String.class),
			@Result(property = "managerPwd", column = "man_pwd", javaType = String.class),
			@Result(property = "managerTel", column = "man_tel", javaType = String.class),
			@Result(property = "managerMail", column = "man_mail", javaType = String.class),
			@Result(property = "role", column = "fk_role_id", javaType = RoleBean.class, one = @One(fetchType=FetchType.LAZY,  select = "getRoleById"))

	})

	@Select("select*from t_manager where id=#{id}")
	public ManagerBean getManager(long id);

	@ResultType(RoleBean.class)
	@Select("select  role_name  as roleName from t_role where id=#{id}")
	public RoleBean getRoleById(long id);

	/**
	 * 根据参数查询管理员总数
	 * 
	 * @param params
	 *            页面参数
	 * @return 返回管理员总数
	 * 
	 */
	@SelectProvider(type = ManagerMapperSqlProvider.class, method = "countManagerByParams")
	public int countManagerByParams(@Param("params") Map params);

	/**
	 * 根据参数查询管理员集合
	 * 
	 * @param params
	 *            页面参数
	 * @return 返回分页的管理员集合
	 */
	@Results({ @Result(id = true, property = "id", column = "id", javaType = Long.class),
		@Result(property = "managerAcc", column = "man_acc", javaType = String.class),
		@Result(property = "managerName", column = "man_name", javaType = String.class),
		@Result(property = "managerPwd", column = "man_pwd", javaType = String.class),
		@Result(property = "managerTel", column = "man_tel", javaType = String.class),
		@Result(property = "managerMail", column = "man_mail", javaType = String.class),
		@Result(property = "role", column = "fk_role_id", javaType = RoleBean.class, one = @One(fetchType=FetchType.LAZY,select = "getRoleById"))

})
	@SelectProvider(type = ManagerMapperSqlProvider.class, method = "findManagerByParams")
	public List<ManagerBean> findManagerByParams(@Param("params") Map params);

}