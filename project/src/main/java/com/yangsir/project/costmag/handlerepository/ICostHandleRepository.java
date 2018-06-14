package com.yangsir.project.costmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yangsir.project.beans.CostBean;
import com.yangsir.project.costmag.mapper.CostMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-6��-2018 16:34:36
 */
public interface ICostHandleRepository extends JpaRepository<CostBean, Long>,JpaSpecificationExecutor<CostBean>{

}