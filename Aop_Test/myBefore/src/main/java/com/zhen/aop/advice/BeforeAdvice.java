package com.zhen.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvice{
	
	@Before("execution( * com.zhen.aop.service.impl.*.*(..))")
	public void authrity(){
		//匹配所有com.zhen.aop.service.impl包下的所有类的所有方法的执行作为切入点
		//（也就是执行这些方法之前先执行这个方法）
		System.out.println("模拟方法执行前进行权限检查");
	}
}