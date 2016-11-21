第一个AspectJ测试程序
1.确保安装了aspectJ，并添加了bin目录到path，并且将aspectjrt.jar到你的classpath
2.进入Hello.java源文件所在的目录,执行
ajc -d ../../../../../classes Hello.java TxAspect.java
3.进入Hello.class的目录，执行
java com.zhen.aspectj.main.Hello
4.这样即可看到结果