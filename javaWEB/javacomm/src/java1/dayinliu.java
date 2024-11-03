package java1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class dayinliu {
    public static void main(String[] args) {
        try(PrintStream stream=new PrintStream(new FileOutputStream("java笔记.txt"))){
            stream.println("cxzcxcxczxc");
        }catch (IOException e){
            e.printStackTrace();
        }
        try(Scanner scanner=new Scanner(new FileInputStream("java笔记.txt"))){
            System.out.println(scanner.nextLine());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
