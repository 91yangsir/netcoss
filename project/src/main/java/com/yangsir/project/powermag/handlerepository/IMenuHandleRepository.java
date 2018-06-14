package com.yangsir.project.powermag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yangsir.project.beans.MenuBean;


public interface IMenuHandleRepository extends JpaRepository<MenuBean, Long>,JpaSpecificationExecutor<MenuBean> {

	
	
}
