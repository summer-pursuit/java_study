package junit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class peizhi {
    public static void main(String[] args) throws IOException {
//        Properties properties=new Properties();
//        properties.load(new FileInputStream("test.properties"));
//        System.out.println(properties);
        System.getProperties().forEach((k,v)-> System.out.println(k+":"+v));
    }
}
