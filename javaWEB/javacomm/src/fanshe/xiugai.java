package fanshe;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;

public class xiugai {
    static class MyClassLoader extends ClassLoader{
        public Class<?> defineClass(String name,byte[] b){
            return defineClass(name,b,0,b.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        Class<?> clazz=Class.forName("fanshe.Student");
        Student student=new Student("小明",16);
        Field name=clazz.getDeclaredField("age");
        name.setAccessible(true);
        System.out.println(student.age);
        name.set(student,99);
        System.out.println(student.age);

    }

}
