package com.yangsir.project.operationlogmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yangsir.project.beans.OperationLogBean;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:37
 * 操作日志操作日志
 */
public interface IOperationLogHandleRepository extends JpaRepository<OperationLogBean, Long>{

}