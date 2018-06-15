package com.yangsir.project.aspects;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yangsir.project.annotation.OperationLog;
import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.operationlogmag.handleService.IOperationLogHandleService;

/**
 * 
 * @author guoqi
 * 操作日志aop切面类
 */
@Component
@Aspect
public class OperationLogAspect {
	@Resource
	private IOperationLogHandleService operationLogHandleServiceImpl;

	@Autowired  
	HttpServletRequest request;
	
	@Pointcut(value="@annotation(com.gq.mybatis.annotation.MyLog)")
	public void annotation() {}
	
	/**
	 * 方法成功返回后执行通知，新增操作日志
	 * @param jp 
	 * @param mylog 自定义的注解数据
	 */
	@AfterReturning(value="annotation() && @annotation(mylog) ")
	public void afterAdvice(JoinPoint jp,OperationLog mylog) {
		OperationLogBean operationLog = new OperationLogBean();
		HttpSession session = request.getSession();
		operationLog.setManagerName(((ManagerBean)session.getAttribute("user")).getManagerName());
		Object data = jp.getArgs()[0];
		operationLog.setOperationLogModel(mylog.model());
		operationLog.setOperationLogTime(new Date());
		operationLog.setOperationLogType(mylog.type());
		operationLog.setOperationLogData(data.toString());
		
		operationLogHandleServiceImpl.saveOperationLog(operationLog);
	}
	
}