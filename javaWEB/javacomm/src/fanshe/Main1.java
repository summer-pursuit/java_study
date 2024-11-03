package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Student> clazz=Student.class;
//        Student student=clazz.newInstance();
//        student.test();
//       Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class,int.class);
//       constructor.setAccessible(true);
//       Student student1=constructor.newInstance("小明",19);
//       student1.test();
    }
}
