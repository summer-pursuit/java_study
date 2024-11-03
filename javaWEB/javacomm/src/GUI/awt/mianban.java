package GUI.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mianban {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);
        GridLayout gridLayout =new GridLayout();
        gridLayout.setRows(2);
        frame.setLayout(gridLayout);//使用网格布局

        Panel panel1=new Panel();//面板
        panel1.setBackground(Color.pink);
        panel1.setLayout(new FlowLayout());//上面面板设置流式布局
        for(int i=0;i<5;i++){
            panel1.add(new Button("流式布局"+i));
        }

        Panel panel2=new Panel();//面板
        panel2.setBackground(Color.orange);
        panel2.setLayout(new GridLayout());
        for(int i=0;i<5;i++){
            panel2.add(new Button("网格布局"+i));
        }

        frame.add(panel1);
        frame.add(panel2);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
