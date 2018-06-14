package com.yangsir.project.usermag.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.yangsir.project.beans.Pager;
import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
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
	})
	@Select(value= {"select * from t_customer where id=#{id}"})
	public UserBean getUserById(Long id);

	/**
	 * 
	 * @param map
	 */
	public Pager findUser2PageByMap(Map map);

}