package com.zhen.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhen.aop.service.Person;

public class BeanTest{
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Person person = ctx.getBean("chinese",Person.class);
		System.out.println(person.sayHello("张三"));
		try{
			person.divide();
		}catch(ArithmeticException e){
			System.out.println("将异常捕获掉，否则方法不能正常执行");
		}
	}
	
}