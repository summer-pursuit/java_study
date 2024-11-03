package GUI.awt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageView extends Component {
    private Image image;
    public  ImageView(String filename){//构造方法，传入文件地址，并处理文件
        try(FileInputStream inputStream=new FileInputStream(filename)){
            image= ImageIO.read(inputStream);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),null);
    }
}
