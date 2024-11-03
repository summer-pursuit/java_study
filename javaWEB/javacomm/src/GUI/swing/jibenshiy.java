package GUI.swing;

import javax.swing.*;

public class jibenshiy {
    public static void main(String[] args) {
        JFrame frame=new JFrame("hello world");
        frame.setBounds(500,500,500,300);//创建位置
        frame.setLayout(null);
        JButton button=new JButton("1号按钮");//创建按钮
        button.setBounds(0,0,100,50);
        frame.add(button);

        JMenuBar bar=new JMenuBar();//创建菜单
        JMenu menu=new JMenu("我是菜单");
        JMenuItem item1=new JMenuItem("三号");
        item1.setAccelerator(KeyStroke.getKeyStroke('U'));//设置快捷键
        item1.addActionListener(e->{//创建监听器测试快捷键
            System.out.println("我被电击！！！");
        });
        menu.add(new JMenuItem("一号"));
        menu.add(new JMenuItem("二号"));
        menu.add(item1);
        bar.add(menu);
        frame.setJMenuBar(bar);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//点击叉号关闭
        frame.setVisible(true);
    }
}
