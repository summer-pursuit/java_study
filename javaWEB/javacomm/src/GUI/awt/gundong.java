package GUI.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class gundong {
    public static void main(String[] args) {
        Frame frame=new Frame("HELLO");
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);
        ScrollPane scrollPane=new ScrollPane();//创建滚动列表
        frame.add(scrollPane);//添加到窗口

        List list=new List();//创建列表
        list.setMultipleMode(true);//支持多选，ctrl/shift
        for(int i=0;i<20;i++){
            list.add("选择"+ i);
        }
        list.addItemListener(e->{
            System.out.println(e.getItemSelectable());
        });
        scrollPane.add(list);//把列表加入滚动面板


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
