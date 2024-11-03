package java1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class zhuanhuanliu {
    public static void main(String[] args) {
        try(OutputStreamWriter stream =new OutputStreamWriter(new FileOutputStream("java笔记.txt"))){
            stream.append("nihiaojkjk");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
