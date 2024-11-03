package GUI.swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Optional;

public class wenjianshu {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(500,500,600,300);
        frame.setLayout(null);

        File file=new File("javacomm");//选择要展示的目录
        DefaultMutableTreeNode root=new DefaultMutableTreeNode(file.getName());//创建根节点
        File[] files= Optional.ofNullable(file.listFiles()).orElseGet(()->new File[0]);//查找所有文件
        for(File f:files){
            root.add(new DefaultMutableTreeNode(f.getName()));//添加子节点，最后树只有两层
        }
        JTree tree=new JTree(root);//添加根节点
        tree.setBounds(0,0,200,300);
        frame.add(tree);

        frame.setVisible(true);

    }
}
