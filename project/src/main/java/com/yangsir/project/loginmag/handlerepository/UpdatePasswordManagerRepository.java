package com.yangsir.project.loginmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yangsir.project.beans.ManagerBean;


public interface UpdatePasswordManagerRepository extends JpaRepository<ManagerBean, Long>,JpaSpecificationExecutor<ManagerBean>{

}
