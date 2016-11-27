package com.zhen.aop.service.impl;

import com.zhen.aop.service.Person;
import org.springframework.stereotype.Component;

@Component
public class Chinese implements Person{
	
	public String sayHello(String name){
		
		return "Hello " + name + ", Spring Aop!";
	}
	
	public void eat(String food){
		System.out.println("I'm eating " + food);
	}
	
}