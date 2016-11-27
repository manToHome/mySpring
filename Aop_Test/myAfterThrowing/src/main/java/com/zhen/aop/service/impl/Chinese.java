package com.zhen.aop.service.impl;

import com.zhen.aop.service.Person;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class Chinese implements Person{
	
	
	/**
	*该方法自己捕获了异常，并处理了，所以AOP不会对该方法进行异常处理
	*
	*/
	@Override
	public String sayHello(String name){
		try{
			System.out.println("sayHello方法开始被执行...");
			new java.io.FileInputStream("a.txt");
		}catch(IOException e){
			System.out.println("目标类的异常处理：" + e.getMessage());
		}
		return  name + "Hello, Spring Aop!";
	}

	/**
	*定义一个会抛出异常的方法
	*/
	@Override
	public void divide(){
		int a = 5 / 0;
		System.out.println("divide执行完成！");
	}
}