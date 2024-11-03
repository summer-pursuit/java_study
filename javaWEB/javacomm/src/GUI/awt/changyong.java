package GUI.awt;

import java.awt.*;
import java.awt.event.*;

public class changyong {
    public static void main(String[] args) {
        Frame frame=new Frame("11111");
        frame.setAlwaysOnTop(true);//始终在最上层
        frame.setBounds(500,300,500,300);//可以一步到位设置窗口大小和位置

        frame.setLayout(null);
        Label label=new Label("我是标签111");
        label.setBounds(20,50,100,30);//设置标签大小位置
        label.setFont(new Font("SimSong",Font.BOLD,15));//设置字体，名称，效果，大小
        frame.add(label);//添加标签
        frame.setFont(new Font("SimSong",Font.ITALIC,15));//整体设置字体
        label.setForeground(Color.orange);//字体颜色
        label.setBackground(Color.CYAN);//字体背景颜色

        Font[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();//获取系统所有字体
        for (Font allFont : allFonts) {
            System.out.println(allFont);
        }//打印所有字体

        TextField textField=new TextField();//添加文本框
        textField.setBounds(20,200,200,30);
        textField.setEchoChar('*');
        frame.add(textField);

        Checkbox checkbox=new Checkbox("记住密码");//勾选框
        checkbox.setBounds(200,100,100,30);
        checkbox.setBackground(Color.gray);
        frame.add(checkbox);

        TextArea textArea=new TextArea();//文本域
        textArea.setBounds(300,100,100,100);
        frame.add(textArea);

        CheckboxGroup group=new CheckboxGroup();//创建勾选框组
        Checkbox c1=new Checkbox("选项a");
        c1.setBounds(150,50,100,30);
        Checkbox c2=new Checkbox("选项b");
        c2.setBounds(150,80,100,30);
        Checkbox c3=new Checkbox("选项c");
        c3.setBounds(150,110,100,30);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        c1.setCheckboxGroup(group);
        c2.setCheckboxGroup(group);
        c3.setCheckboxGroup(group);


        Button button=new Button("我是按钮");//创建按钮
        button.setBounds(20,100,100,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                System.out.println("输入的文本是："+text);//点击按钮获取文本框内容
                boolean state = checkbox.getState();//获取勾选状态
                System.out.println(state);
                System.out.println(group.getSelectedCheckbox().getLabel());
            }
        });
        frame.add(button);


        frame.addWindowListener(new WindowAdapter() {//设置点击叉号关闭
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);//设置窗口可见
    }
}
