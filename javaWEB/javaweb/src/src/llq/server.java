package llq;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try(ServerSocket server=new ServerSocket(8080)){
            System.out.println("等待客户端连接。。。");
            Socket socket=server.accept();
            System.out.println("客户端已经连接，ip为："+socket.getInetAddress().getHostAddress());
            //编写返回值展示在网页上
            OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
            writer.write("HTTP/1.1 200 Accepted\r\n");
            writer.write("\r\n");
            writer.write("zxczxczxcz");
            writer.flush();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
