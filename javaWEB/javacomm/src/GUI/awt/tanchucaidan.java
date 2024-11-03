package GUI.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tanchucaidan {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setAlwaysOnTop(true);
        frame.setBounds(500,500,500,300);
        PopupMenu menu=new PopupMenu();//创建
        menu.add(new MenuItem("1号"));
        menu.add(new MenuItem("2号"));
        frame.add(menu);

        frame.addMouseListener(new MouseAdapter() {//监听右键
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3){//设置右键点击触发
                    menu.show(frame,e.getX(),e.getY());
            }
        }
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

