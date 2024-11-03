package java1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class zijieliu {
    public static void main(String[] args) {
        try(FileReader reader=new FileReader("hello.txt");
            FileWriter writer=new FileWriter("hello111.txt")){
            char[] chars=new char[3];
            int len;
            while((len=reader.read(chars))!=-1){
                writer.write(chars,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
