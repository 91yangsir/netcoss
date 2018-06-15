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
	 * module 操作模块
	 * type 操作类型
	 */

	String model() default "";

	int type() default 0;
	
}
