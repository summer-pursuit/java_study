package GUI.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ujv {
    public static void main(String[] args) throws InterruptedException {
        Frame frame=new Frame("helloworld");
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
