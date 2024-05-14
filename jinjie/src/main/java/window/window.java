package window;

import javax.swing.*;
import java.awt.*;

public class window {
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        //获取窗体对象
        Container container=jf.getContentPane();
        container.setLayout(null);

        //设置窗口大小
        jf.setSize(512,416);

        //设置窗体的关闭模式为关闭就结束程序
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗体标题
        jf.setTitle("石头迷阵");

       //设置按钮
         JButton jbut=new JButton("开始游戏");
         //设置按钮位置，长宽
        jbut.setBounds(100,100,300,100);
        //加载按钮组件
        container.add(jbut);

        //设置图片
        JLabel image1 = new JLabel(new ImageIcon("F:\\新建文件夹\\image\\1.png"));
        image1.setBounds(1,20,200,460);
        container.add(image1);

        //取消默认布局

        jf.setVisible(true);//设置窗口可见
    }
}
