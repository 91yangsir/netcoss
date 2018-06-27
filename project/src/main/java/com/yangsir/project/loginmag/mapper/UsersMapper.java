package com.yangsir.project.loginmag.mapper;


import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import com.yangsir.project.beans.UserBean;

public interface UsersMapper {
   
	/**
	 * 用户查询自己信息
	 * @param 
	 * @return
	 */
	@ResultType(UserBean.class)
	@Select(value = "select id as id,user_gender as userGender,user_card as userCard,user_acc as userAcc,user_pwd as userPwd,user_tel as userTel,user_address as  userAddress,user_post as userPost,user_qq as userQQ from t_user where id = #{id}")
	public UserBean getUserByuserAcc(String userAcc);
	
	
	
	
	
	
}
