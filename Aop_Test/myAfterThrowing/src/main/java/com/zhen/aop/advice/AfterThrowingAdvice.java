package com.zhen.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class AfterThrowingAdvice{
	
	/**
	*方法中需要有一个参数与throwing指定的值一样，
	*并且这个参数的类型决定了这个增强处理能增强的抛出异常方法
	*例如：这里参数的类型是Throwable，所以可以拦截所有满足pointcut的并抛出任何异常的方法
	*如果这里指定的参数的类型是NullPointerExcetion,那它只能增强满足pointcut的，并且抛出NullPointerException的方法
	*/
	@AfterThrowing(throwing="e",pointcut="execution( * com.zhen.aop.service.impl.*.*(..))")
	public void doRecoveryActions(Throwable e){
		//匹配所有com.zhen.aop.service.impl包下的所有类的所有方法的执行作为切入点
		//（也就是执行这些方法正常执行完之后执行这个方法）
		System.out.println("目标方法中抛出的异常：" + e);
		System.out.println("模拟抛出异常后的增强处理...");
	}
}