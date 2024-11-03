package java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class wenjianduix {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\29753\\Desktop\\模型.mp4");
        try(FileInputStream in =new FileInputStream(file);
            FileOutputStream out=new FileOutputStream("xx1.mp4")){
            byte[] bytes=new byte[1024];
            int len;
            long tatal=file.length(),sum=0;
            while((len=in.read(bytes))!=-1){
                out.write(bytes,0,len);
                sum+=len;
                System.out.println("文件以拷贝："+(sum/tatal)*100+"%");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
