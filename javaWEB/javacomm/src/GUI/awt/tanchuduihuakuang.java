package GUI.awt;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tanchuduihuakuang {
    public static void main(String[] args) {
        Frame frame=new Frame("hello");
        frame.setAlwaysOnTop(true);
        frame.setBounds(500,500,500,300);

        FileDialog fileDialog=new FileDialog(frame,"请选择一个文件",FileDialog.LOAD);//创建文件选择弹窗
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fileDialog.setVisible(true);
                System.out.println("选择的文件为："+fileDialog.getDirectory()+fileDialog.getFile());
            }
        });
        frame.setVisible(true);
    }
}
