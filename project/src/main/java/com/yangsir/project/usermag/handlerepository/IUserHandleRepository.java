package com.yangsir.project.usermag.handlerepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangsir.project.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IUserHandleRepository extends JpaRepository<UserBean, Long>{



}