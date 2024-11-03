package fanshe;

import java.lang.reflect.Method;

public class zhujie {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<zhujie> zhujieClass=zhujie.class;
        Method test1=zhujieClass.getMethod("test");
        Test annotation = test1.getAnnotation(Test.class);
        System.out.println(annotation.value());
    }
    @Test("Hello world")
    public void test(){
    }
}
