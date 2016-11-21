package com.zhen.aspectj.main;


/**
*为Hello对象的sayHello()方法后面加上日志记录
*/
public aspect LogAspect{
	
	//定义一个PointCut，其名为logPointcut，对应Hello对象的sayHello方法
	pointcut logPointcut()
		:execution(void Hello.sayHello());
	
	//在logPointcut之后执行下面的代码块
	after():logPointcut(){
		System.out.println("log...");
	}
	
}