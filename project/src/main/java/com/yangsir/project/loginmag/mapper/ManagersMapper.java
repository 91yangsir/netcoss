package com.yangsir.project.loginmag.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.yangsir.project.beans.ManagerBean;

public interface ManagersMapper {
	
	/**
	 * 管理员查询自己信息
	 * @param 
	 * @return
	 */
	
	@ResultType(ManagerBean.class)
	@Select(value = "select id as id,man_name as managerName,man_acc as managerAcc,man_pwd as managerPwd,man_tel as managerTel,man_mail as managerMail from t_manager where id = #{id}")
	public ManagerBean getManagerBymanagerAcc(String managerAcc);
}
