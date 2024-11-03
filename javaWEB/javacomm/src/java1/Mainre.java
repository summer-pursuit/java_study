package java1;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mainre {
    public static void main(String[] args) {
        try(FileInputStream in =new FileInputStream("C:\\Users\\29753\\Desktop\\模型.mp4");
            FileOutputStream out =new FileOutputStream("move.mp4")){
            byte[] bytes=new byte[in.available()];
            in.read(bytes);
            out.write(bytes);

//            byte[] bytes=new byte[1024];
//            int len;
//            while((len=in.read(bytes))!=-1){
//                out.write(bytes,0,len);
//            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
