package GUI.swing;

import javax.swing.*;

public class yanse {
    public static void main(String[] args) {
        JFrame frame=new JFrame("我是标题");
        frame.setBounds(500,500,600,300);
        frame.setLayout(null);
        JColorChooser chooser=new JColorChooser();
        chooser.setBounds(0,0,600,300);
        frame.add(chooser);


        frame.setVisible(true);
    }
}
