package GUI.awt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class zidingyi {
    public static void main(String[] args) throws IOException {
        Frame frame=new Frame("hello");
        frame.setBounds(500,500,500,300);
        frame.setAlwaysOnTop(true);
        frame.setIconImage(ImageIO.read(new File("C:\\Users\\29753\\Desktop\\project\\java\\图片21.png")));

        ImageView imageView =new ImageView("C:\\Users\\29753\\Desktop\\project\\java\\图片21.png");
        imageView.setBounds(20,50,100,50);

        frame.add(imageView);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
