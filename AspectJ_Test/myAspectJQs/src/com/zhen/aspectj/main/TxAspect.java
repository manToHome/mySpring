package com.zhen.aspectj.main;

public aspect TxAspect{
	
	void around():call(void Hello.sayHello()){
		System.out.println("Transaction start...");
		proceed();
		System.out.println("Transaction end...");
	}
	
}