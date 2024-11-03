package org.book.entity;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Aspect
@Component

public class StudentAOP {
    @After(value = "execution(* org.book.entity.Student.study(..)) && args(str)",argNames = "str")
    public void afterstudy(String str){
        System.out.println(str+"我是后置！");
    }




//    public void afterstudy(JoinPoint point){
//        System.out.println("我是后置方阿飞"+point.getArgs()[0]);
//    }
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("方法开始之前");
//        String arg = joinPoint.getArgs()[0] + "伞兵一号";
//        Object value = joinPoint.proceed(new Object[]{arg});
//        System.out.println("方法执行完成，结果为："+value);
//        return value;
//    }
//    public void async(ProceedingJoinPoint joinPoint){
//        new Thread(()->{
//            try {
//                joinPoint.proceed(joinPoint.getArgs());
//            }catch (Throwable e){
//                throw  new RuntimeException(e);
//            }
//        }).start();
//    }
//    @Override
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//        System.out.println("执行之前！");
//        Object value=invocation.proceed();
//        System.out.println("执行之后！");
//        return null;
//    }
}
