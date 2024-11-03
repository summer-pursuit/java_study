package GUI.swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class duomianban {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(500,500,600,300);
        frame.setAlwaysOnTop(true);
        JTextArea area=new JTextArea();

        File file=new File("C:\\Users\\29753\\Desktop\\project\\java\\javacomm\\src\\GUI\\swing");//选择要展示的目录
        DefaultMutableTreeNode root=new DefaultMutableTreeNode(file.getName());//创建根节点
        File[] files= Optional.ofNullable(file.listFiles()).orElseGet(()->new File[0]);//查找所有文件
        for(File f:files){
            root.add(new DefaultMutableTreeNode(f.getName()));//添加子节点，最后树只有两层
        }
        JTree tree=new JTree(root);//添加根节点
        tree.addTreeSelectionListener(e->{//点击文件时触发
            System.out.println(file.getPath()+e.getPath().getLastPathComponent().toString());
            area.setText("");//将展示框清除
            try(FileReader reader=new FileReader(file.getPath()+"\\"+e.getPath().getLastPathComponent().toString())){
                char[] chars=new char[128];
                int len;
                while ((len=reader.read(chars))>0){
                    area.setText(area.getText()+new String(chars,0,len));//逐渐向展示框写入文本
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }


        });

        JSplitPane pane=new JSplitPane();//创建分割面板
        pane.setLeftComponent(new JScrollPane(tree));
        pane.setRightComponent(new JScrollPane(area));

        frame.add(pane);
        frame.setVisible(true);
    }
}
