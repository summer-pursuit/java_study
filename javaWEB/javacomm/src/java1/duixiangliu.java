package java1;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duixiangliu {
    public static void main(String[] args) {
        try(ObjectOutputStream stream= new ObjectOutputStream(new FileOutputStream("java笔记.txt"));
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("java笔记.txt"))){
            List<String> list =new ArrayList<>(Arrays.asList("A", "a", "d"));
            stream.writeObject(list);
            ArrayList o=(ArrayList) in.readObject();
            System.out.println(o.get(1));

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        }
}
