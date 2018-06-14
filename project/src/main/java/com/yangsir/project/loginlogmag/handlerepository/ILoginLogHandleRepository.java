package com.yangsir.project.loginlogmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangsir.project.beans.LoginLogBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 * 登陆日志持久层操作接口
 */
public interface ILoginLogHandleRepository extends JpaRepository<LoginLogBean, Long>{

}