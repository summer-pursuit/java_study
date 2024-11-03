package java1;

import java.io.*;

public class huanchongliu {
    public static void main(String[] args) {
        try(BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream("java笔记.txt",true))){
            stream.write("dcjkxljc:XZ".getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
