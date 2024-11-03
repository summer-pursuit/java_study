package GUI.swing;

import libary.Book;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class pifu {
    static {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch (UnsupportedLookAndFeelException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(500,500,600,300);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        JButton button=new JButton("11111");
        button.setBounds(20,20,100,30);
        frame.setLayout(null);
        frame.add(button);

        frame.setVisible(true);
    }
}
