package GUI.swing;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class zujianjindutiao {
    public static void main(String[] args) {
        JFrame frame=new JFrame("我是标题");
        frame.setBounds(500,500,500,300);
        frame.setLayout(null);

        JProgressBar bar=new JProgressBar();//创建进度条
        bar.setMaximum(1000);
        bar.setBounds(20,20,200,10);
        frame.add(bar);

        JButton button=new JButton("点击开始");
        button.setBounds(20,100,100,30);
        button.addActionListener(event->{
            new Thread(()->{
                File file=new File("C:\\Users\\29753\\Desktop\\project\\java\\move.mp4");
                try(FileInputStream in =new FileInputStream(file);
                    FileOutputStream out=new FileOutputStream("C:\\Users\\29753\\Desktop\\project\\java\\x1x1x1.mp4")){
                    long size=file.length(),current=0;
                    byte[] arr=new byte[512];
                    int len;
                    while((len=in.read(arr))>0){
                        out.write(arr,0,len);
                        current+=len;
                        int value=(int)(current*1000.0/size);
                        bar.setValue(value);
                        bar.repaint();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
            });
        button.setToolTipText("你好");
        frame.add(button);

        frame.setVisible(true);
}
}
