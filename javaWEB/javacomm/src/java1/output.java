package java1;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;


public class output {
    public static void main(String[] args)  {
        try(FileOutputStream stream=new FileOutputStream("C:\\Users\\29753\\Desktop\\project\\java\\hello.txt")) {
            System.out.println(stream);
            stream.write("helloworld".getBytes(),3,2);
            stream.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
