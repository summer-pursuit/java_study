package jdbc;

public class Student {
    Integer sid;
    String name;
    String sex;

    public Student(Integer sid,String name,String sex) {
        this.sex = sex;
        this.name = name;
        this.sid = sid;
    }
    public void say(){
        System.out.println("我是"+name+"学号"+sid+"性别"+sex);
    }
}
