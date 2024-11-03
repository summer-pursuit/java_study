package GUI.awt;

import java.awt.*;
import java.awt.event.*;

public class jiantingqi {
    public static void main(String[] args) {
        Frame frame=new Frame("11111");
        frame.setAlwaysOnTop(true);//始终在最上层
        frame.setBounds(500,300,500,300);//可以一步到位设置窗口大小和位置

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Helloworld");
                System.exit(0);//可以关闭
//                frame.dispose();//也可以
            }
        });//窗口监听器，需要传入实现，可自动实现

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());//方法实现重写
            }
        });//监听键盘点击了什么

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+","+e.getY());
                System.out.println(e.getButton());
            }
        });//监听鼠标

        frame.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println(e.getScrollAmount());
            }
        });//监听鼠标滚动


        frame.setVisible(true);//设置窗口可见
    }
}
