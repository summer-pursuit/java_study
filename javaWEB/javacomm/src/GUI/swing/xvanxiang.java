package GUI.swing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class xvanxiang {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//设置不作
        //自己处理
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                int value = JOptionPane.showConfirmDialog(frame,"确定要弹出吗？！","提示",JOptionPane.YES_NO_OPTION);
//                if (value==JOptionPane.OK_OPTION){//点击确定
//                    System.exit(0);
//                }
//
//            }
//        });
//
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                String s=JOptionPane.showInputDialog("请输入文本");
//                System.out.println(s);
//            }
//        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame,"没充钱不能退出");
            }
        });



        frame.setVisible(true);
    }
}
