package GUI.awt;
import java.awt.*;

public class Frameuse {
    public static void main(String[] args) {
        Frame frame=new Frame("11111");
        frame.setTitle("test");//设置标题
        frame.setSize(500,300);//设置大小
        frame.setBackground(Color.orange);//设置背景颜色
        frame.setAlwaysOnTop(true);//始终在最上层
        frame.setResizable(false);//是否可以调整大小
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//获取屏幕参数
        int x=(int)(screenSize.getWidth()/2-frame.getWidth()/2);//设置居中
        int y=(int)(screenSize.getHeight()/2-frame.getHeight()/2);
        frame.setLocation(x,y);//屏幕显示坐标
//        frame.setBounds(500,500,500,300);//可以一步到位设置窗口大小和位置
        frame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));//设置页面内光标样式
        frame.setVisible(true);//设置窗口可见
    }
}
