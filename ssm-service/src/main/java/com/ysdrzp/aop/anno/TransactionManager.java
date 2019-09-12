package com.ysdrzp.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManager {

    @Pointcut(value = "execution(* com.ysdrzp.ssm.aop.anno.*ServiceImpl..*(..))")
    public void txPoint(){

    }

    //@Before("txPoint()")
    public void begin(){
        System.out.println("开启事务");
    }

    //@AfterReturning("txPoint()")
    public void commit(){
        System.out.println("事物提交");
    }

    //@AfterThrowing("txPoint()")
    public void rollBack(){
        System.out.println("关闭事务");
    }

    //@After("txPoint()")
    public void close(){
        System.out.println("关闭资源");
    }

    @Around("txPoint()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object oj = null;
        begin();
        try {
            oj = joinPoint.proceed();
            commit();
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            rollBack();
        } finally {
            close();
        }
        return oj;
    }
}
