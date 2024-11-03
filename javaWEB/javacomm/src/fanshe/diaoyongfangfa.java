package fanshe;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class diaoyongfangfa {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//        Class<Student> clazz=Student.class;
//        Method test=clazz.getDeclaredMethod("test");
//        test.setAccessible(true);
//        test.invoke(new Student("小明",28));
        Class<?> clazz=Class.forName("fanshe.Student");
        Constructor<?> constructor=clazz.getConstructor(String.class,int.class);
        Object o=constructor.newInstance("小明",22);
        Method test=clazz.getMethod("test");
        test.invoke(o);
    }
}
