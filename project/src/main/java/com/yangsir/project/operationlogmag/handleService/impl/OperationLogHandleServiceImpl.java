package com.yangsir.project.operationlogmag.handleService.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.operationlogmag.handleService.IOperationLogHandleService;
import com.yangsir.project.operationlogmag.handlerepository.IOperationLogHandleRepository;

/**
 * @author guoqi
 * @version 1.0
 * @created 13-6��-2018 16:34:41
 * 操作日志持久层实现类
 */
@Service
public class OperationLogHandleServiceImpl implements IOperationLogHandleService {

	@Resource
	public IOperationLogHandleRepository operationLogHandleRepository;

	/**
	 * 新增操作日志
	 * @param operationLog 操作日志信息
	 */
	public void saveOperationLog(OperationLogBean operationLog){
		operationLogHandleRepository.save(operationLog);
	}

}