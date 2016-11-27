@echo off
title=myBefore
::如果不加上call命令调用maven的命令，pause不起作用，命令行会自动退出（分析原因为mvn本身是一个bat命令，因此在exit退出的时候，整个脚本进程将退出，加入call命令调用即可）
call mvn clean compile exec:java -Dexec.mainClass="com.zhen.aop.main.BeanTest"
pause