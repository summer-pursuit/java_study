package GUI.swing;

import javax.swing.*;

public class kaiguan {
    public static void main(String[] args) {
        JFrame frame=new JFrame("我是标题");
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);

        JToggleButton button=new JToggleButton("我是开关！");
        button.setBounds(10,10,100,30);
        frame.add(button);



        frame.setVisible(true);
    }
}
