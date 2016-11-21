package com.zhen.aspectj.main;

public class Hello{
	
	public void sayHello(){
		System.out.println("Hello AspectJ!");
	}
	
	public static void main(String[] args){
		new Hello().sayHello();
	}
}