package org.book.entity;

import org.springframework.stereotype.Component;

@Component
public class Student  {
    public void study(String str){
        System.out.println("我是学习方法！");
    }



//    public String study(String str){
//        if(str.equals("Java"))
//            System.out.println("我的梦想是学Java");
//        else {
//            System.out.println("我就要学Java，不要修改我的梦想！");
//            str = "Java";
//        }
//        return str;
//    }
//    public List<Clazz> list=List.of(new Clazz("搞得跟属性",3),
//            new Clazz("应用",9));
//
//
//    public record Clazz(String name,int score){}
//    String  name;
//    public Student(@Value("${test.name}") String name){
//        this.name=name;
//    }
//    public void test(){
//        System.out.println("我叫"+name);
//    }

//    ApplicationEventPublisher publisher;
//
//    @Override
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        this.publisher=applicationEventPublisher;
//    }
//    @Scheduled(fixedRate = 1000)
//    public void test(){
//        publisher.publishEvent(new TestEvent(this));
//    }


//        public void syncTest() throws InterruptedException {
//            System.out.println(Thread.currentThread().getName()+"我是同步执行的方法，开始...");
//            Thread.sleep(3000);
//            System.out.println("我是同步执行的方法，结束！");
//        }
//
//        @Async
//        public void asyncTest() throws InterruptedException {
//            System.out.println(Thread.currentThread().getName()+"我是异步执行的方法，开始...");
//            Thread.sleep(3000);
//            System.out.println("我是异步执行的方法，结束！");
//        }
//    @Scheduled(cron = "*/2 * * * * *")   //单位依然是毫秒，这里是每两秒钟打印一次
//    public void task(){
//        System.out.println("我是定时任务！"+new Date());
//    }
    }

