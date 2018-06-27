package com.yangsir.project.loginmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.UserBean;

public interface UpdatePasswordUserRepository extends JpaRepository<UserBean, Long>,JpaSpecificationExecutor<UserBean>{
	
	
	
}
