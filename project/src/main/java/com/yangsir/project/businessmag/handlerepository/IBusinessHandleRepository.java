package com.yangsir.project.businessmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangsir.project.beans.BusinessBean;

/**
 * 
 * @author dl
 *
 */
public interface IBusinessHandleRepository extends JpaRepository<BusinessBean, Long>{

	
}
