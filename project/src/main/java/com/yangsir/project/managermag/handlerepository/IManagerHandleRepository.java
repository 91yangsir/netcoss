package com.yangsir.project.managermag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.yangsir.project.beans.ManagerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 */

@Repository
public interface IManagerHandleRepository  extends JpaRepository<ManagerBean, Long>,JpaSpecificationExecutor<ManagerBean>{


}