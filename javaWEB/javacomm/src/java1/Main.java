package java1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args)  {
        try(FileInputStream stream=new FileInputStream("C:\\Users\\29753\\Desktop\\project\\java\\hello.txt")) {
            System.out.println(stream);
//            int i;
//            while((i=stream.read())!=-1) {
//                System.out.print((char) i);
//            }//单个
//            byte[] bytes=new byte[3];
//            while(stream.read(bytes)!=-1){
//                System.out.print(new String(bytes));
//            }//限定每次读多少
//            byte[] bytes=new byte[stream.available()];
//            stream.read(bytes);
//            System.out.println(new String(bytes));
//            //一次性读完
//            stream.skip(3);//跳过
//            stream.read();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
