package com.yangsir.project.powermag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yangsir.project.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:38
 */
public interface IPowerHandleRepository extends JpaRepository<RoleBean, Long>,JpaSpecificationExecutor<RoleBean> {

	
}