package com.yangsir.project.billmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yangsir.project.beans.TimeUseBean;

public interface IHandleBillRepository extends JpaRepository<TimeUseBean, Long>,JpaSpecificationExecutor<TimeUseBean> {

}
