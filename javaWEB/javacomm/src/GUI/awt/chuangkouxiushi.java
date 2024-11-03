package GUI.awt;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class chuangkouxiushi {
    public static void main(String[] args) {
        Frame frame=new Frame("hello");

        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);

        frame.setUndecorated(true);//创建未加修饰的窗口
        frame.setShape(new RoundRectangle2D.Double(0,0,frame.getWidth(),frame.getHeight(),30,30));



        frame.setVisible(true);
    }
}
