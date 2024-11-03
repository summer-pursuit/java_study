package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {
        try (ServerSocket server=new ServerSocket(8080)){
            Socket socket=server.accept();
            FileOutputStream fileOutputStream=new FileOutputStream("file/data.md");
            InputStream stream=socket.getInputStream();
            byte[] bytes=new byte[1024];
            int i;
            while((i=stream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
