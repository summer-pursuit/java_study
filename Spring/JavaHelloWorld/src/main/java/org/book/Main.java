package org.book;

import org.book.config.MainConfiguration;
import org.book.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student bean=context.getBean(Student.class);
        bean.study("451");




//        ExpressionParser parser=new SpelExpressionParser();
//        Student student=context.getBean(Student.class);
//        Expression exp=parser.parseExpression("list.![name]");
//        System.out.println(exp.getValue(student));
//

//        System.out.println(exp.getValue());
//        Student student=context.getBean(Student.class);
//        System.out.println(exp.getValue(student));
//        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfiguration.class);
//        Student student=context.getBean(Student.class);
//        student.test();
//        System.out.println("任务开始");
//        student.asyncTest();
//        System.out.println("任务结束");
//        student.task();

    }
}