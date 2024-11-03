package socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try (Socket socket=new Socket()){
            socket.connect(new InetSocketAddress("localhost",8080));//与原来等效
            System.out.println("已连接服务器！");
            FileInputStream fileInputStream=new FileInputStream("考研.md");
            OutputStream stream=socket.getOutputStream();
            byte[] bytes=new byte[1024];
            int i;
            while((i=fileInputStream.read(bytes))!=-1){
                stream.write(bytes,0,i);
            }
            stream.flush();

        } catch (IOException e) {
            System.out.println("连接服务器失败");
            e.printStackTrace();
        }
    }
}
