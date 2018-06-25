package com.yangsir.project.usersystemmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.beans.UserBean;

/**
 * @author 樊绍通
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IUsersysHandleRepository extends JpaRepository<UserBean, Long>{


}