package GUI.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class caidanlan {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setAlwaysOnTop(true);
        frame.setBounds(500,500,500,300);

        MenuBar bar=new MenuBar();//创建菜单栏
        Menu menu=new Menu("我是菜单");//创建菜单
        MenuItem item1=new MenuItem("1号");//创建内容
        MenuItem item2=new MenuItem("2号");
        CheckboxMenuItem item3=new CheckboxMenuItem("3号");//可以实现勾选
        menu.add(item1);//加入
        menu.add(item2);
        menu.add(item3);
        bar.add(menu);
        frame.setMenuBar(bar);

        item2.setShortcut(new MenuShortcut('U',true));//设置快捷键,true是加shift

        item1.addActionListener(e->{//可以添加监听器
            System.out.println("1号被点击");
        });
        item2.addActionListener(e->{
            System.out.println("2号被点击");
        });


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
