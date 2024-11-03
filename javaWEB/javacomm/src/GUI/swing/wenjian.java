package GUI.swing;

import javax.swing.*;

public class wenjian {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(500,500,600,300);
        frame.setLayout(null);

        JFileChooser chooser=new JFileChooser();
        chooser.setBounds(0,0,600,300);
        frame.add(chooser);

        frame.setVisible(true);
    }
}
