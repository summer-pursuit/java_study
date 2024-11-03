package fanshe;

public class Student {
    String name;
    final int age;
    public void setName(){

    }
    public Student(String name,int age){
        System.out.println("jjkjkjkj");
        this.name=name;
        this.age=age;
    }

    public void test(){
        System.out.println("hhh");
        System.out.println("我是"+name+"今年"+age+"岁。");
    }

}
