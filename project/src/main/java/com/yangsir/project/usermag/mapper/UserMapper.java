package com.yangsir.project.usermag.mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.RoleBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author dl
 * @version 1.0
 * @created 13-6��-2018 16:34:42
 */
public interface UserMapper {
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=Integer.class),
		@Result(property="userCard",column="user_card",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userQQ",column="user_qq",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userState",column="user_state",javaType=Integer.class),
		@Result(property="business",column="id",javaType=Set.class,
		many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.businessmag.mapper.BusinessMapper.getBusinessByUserId")),
		@Result(property="role",column="fk_role_id",javaType=RoleBean.class,
		many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.powermag.mapper.PowerMapper.findRoleById"))
	})
	@Select(value= {"select * from t_user where id=#{id}"})
	public UserBean getUserById(@Param("id")Long id);

	
	/**
	 * 根据用户账号查询用户信息
	 * @param acc
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=Integer.class),
		@Result(property="userCard",column="user_card",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userQQ",column="user_qq",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userState",column="user_state",javaType=Integer.class),
		@Result(property="business",column="id",javaType=Set.class,
		many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.businessmag.mapper.BusinessMapper.getBusinessByUserId")),
		@Result(property="role",column="fk_role_id",javaType=RoleBean.class,many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.powermag.mapper.PowerMapper.findRoleById"))
	})
	@Select(value= {"select * from t_user where user_acc=#{acc}"})
	public UserBean getUserByAcc(@Param("acc")String acc);
	
	
	
	/**
	 * 根据多参数查询用户数量
	 * @param params 页面获得的参数
	 * @return 
	 */
	@SelectProvider(type=UserMapperProvider.class, method = "countUserByParams")
	public int countUserByParams(@Param("params")Map params);
	
	
	/**
	 * 根据参数查询用户,获得用户集合
	 * @param params 页面获得的参数
	 * @return 分页的用户集合
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=Integer.class),
		@Result(property="userCard",column="user_card",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userQQ",column="user_qq",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userState",column="user_state",javaType=Integer.class),
	})
	@SelectProvider(type=UserMapperProvider.class, method = "findUserByParams")
	public List<UserBean> findUserByParams(@Param("params")Map params);
	
	
	/**
	 * 查询所有开通用户
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=Integer.class),
		@Result(property="userCard",column="user_card",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userQQ",column="user_qq",javaType=String.class),
		@Result(property="userPost",column="user_post",javaType=String.class),
		@Result(property="userState",column="user_state",javaType=Integer.class),
	})
	@Select(value= {"select * from t_user where user_state=1"})
	public List<UserBean> getAllUser();
}