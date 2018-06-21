package com.yangsir.project.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {
	
	/**
	 * module 操作模块 1-日志管理 2-用户管理 3-资费管理 4-权限管理 5-账单管理 6-账务查询管理 7-业务帐号管理 8-管理员管理 
	 * type 操作类型   0-新增  1-修改  2-删除
	 */

	int model() default 0;

	int type() default -1;
	
}
