package com.yangsir.project.usermag.mapper;

import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.BusinessBean;
import com.yangsir.project.beans.Pager;
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
		many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.businessmag.mapper.BusinessMapper.getBusinessByUserId"))
	})
	@Select(value= {"select * from t_user where id=#{id}"})
	public UserBean getUserById(@Param("id")Long id);

	
	/**
	 * 根据账号查询用户信息
	 * @param acc
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="business",column="id",javaType=Set.class,
		many=@Many(fetchType=FetchType.LAZY,select="com.yangsir.project.businessmag.mapper.BusinessMapper.getBusinessByUserId"))
	})
	@Select(value= {"select id from t_user where user_acc=#{acc}"})
	public UserBean getUserByAcc(@Param("acc")String acc);
	
	
	
	/**
	 * 分页查询用户
	 * @param map   
	 */
	public Pager findUser2PageByMap(Map map);
	
}