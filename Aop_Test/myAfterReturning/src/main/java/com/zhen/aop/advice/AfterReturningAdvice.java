package com.zhen.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class AfterReturningAdvice{
	
	/**
	*方法中需要有一个参数与returning指定的值一样，
	*并且这个参数的类型决定了这个增强处理能增强的方法
	*例如：这里参数的类型是Object，所以可以拦截所有满足pointcut的方法(包括返回值类型为void的方法)
	*如果这里指定的参数的类型是String,那它只能增强满足pointcut的，并且返回值类型为String的方法
	*/
	@AfterReturning(returning="returnObj",pointcut="execution( * com.zhen.aop.service.impl.*.*(..))")
	public void log(Object returnObj){
		//匹配所有com.zhen.aop.service.impl包下的所有类的所有方法的执行作为切入点
		//（也就是执行这些方法正常执行完之后执行这个方法）
		System.out.println("获取目标方法的返回值：" + returnObj);
		System.out.println("模拟记录日志功能");
	}
}