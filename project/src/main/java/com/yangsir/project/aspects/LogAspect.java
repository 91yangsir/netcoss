package com.yangsir.project.aspects;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yangsir.project.annotation.OperationLog;
import com.yangsir.project.beans.LoginLogBean;
import com.yangsir.project.beans.ManagerBean;
import com.yangsir.project.beans.OperationLogBean;
import com.yangsir.project.loginlogmag.handleservice.ILoginLogHandleService;
import com.yangsir.project.operationlogmag.handleService.IOperationLogHandleService;

/**
 * 
 * @author guoqi
 * 操作日志aop切面类
 */
@Component
@Aspect
public class LogAspect {
	@Resource
	private IOperationLogHandleService operationLogHandleServiceImpl;
	
	@Resource
	private ILoginLogHandleService loginLogHandleServiceImpl;
	
	/**
	 * 操作日志切入点
	 */
//	@Pointcut(value="@annotation(com.yangsir.project.annotation.OperationLog)")
	public void annotation() {}
	
	/**
	 * 登录切入点
	 */
//	@Pointcut(value="execution(* com.yangsir.project.*mag.controller.*Controller.*(..))")
	public void login() {}
	
	/**
	 * 退出切入点
	 */
//	@Pointcut(value="execution(* com.yangsir.project.*mag.controller.*Controller.*(..))")
	public void exit() {}
	
	/**
	 * 方法成功返回后执行通知，新增操作日志
	 * @param jp 
	 * @param mylog 自定义的注解数据
	 */
//	@AfterReturning(value="annotation() && @annotation(mylog) ")
//	public void afterOperationAdvice(JoinPoint jp,OperationLog mylog) {
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//		OperationLogBean operationLog = new OperationLogBean();
//		HttpSession session = request.getSession();
//		operationLog.setManagerName(((ManagerBean)session.getAttribute("user")).getManagerName());
//		Object data = jp.getArgs()[0];
//		operationLog.setOperationLogModel(mylog.model());
//		operationLog.setOperationLogTime(new Date());
//		operationLog.setOperationLogType(mylog.type());
//		operationLog.setOperationLogData(data.toString());
//		
//		operationLogHandleServiceImpl.saveOperationLog(operationLog);
//	}
//	
//	/**
//	 * 登录后置通知
//	 * @param jp
//	 */
//	@AfterReturning(value="login()")
//	public void afterLoginAdvice(JoinPoint jp) {
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//		LoginLogBean loginLog = new LoginLogBean();
//		HttpSession session = request.getSession();
//		loginLog.setManagerName(((ManagerBean)session.getAttribute("user")).getManagerName());
//		loginLog.setLoginLogIP(request.getRemoteAddr());
//		loginLog.setLoginLogTime(new Date());
//		loginLog.setLoginLogType(0);
//		loginLogHandleServiceImpl.saveLoginLog(loginLog);
//	}
//	
//	/**
//	 * 退出前置通知
//	 * @param jp
//	 */
//	@Before(value="exit()")
//	public void beforeExitAdvice(JoinPoint jp) {  
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//		LoginLogBean loginLog = new LoginLogBean();
//		HttpSession session = request.getSession();
//		loginLog.setManagerName(((ManagerBean)session.getAttribute("user")).getManagerName());
//		loginLog.setLoginLogIP(request.getRemoteAddr());
//		loginLog.setLoginLogTime(new Date());
//		loginLog.setLoginLogType(1);
//		loginLogHandleServiceImpl.saveLoginLog(loginLog);
//	}
	
}