package fanshe;

import java.util.ArrayList;

public class duotai {
    public static void main(String[] args) {
        Class<?>[] clazz= ArrayList.class.getInterfaces();
        for (Class<?>i:clazz){
            System.out.println(i);
        }
    }
}
