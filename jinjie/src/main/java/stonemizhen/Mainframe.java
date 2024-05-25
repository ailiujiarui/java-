package stonemizhen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class Mainframe extends JFrame implements KeyListener {
    int data[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int win[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
    int X0;//空白块的横坐标
    int Y0;//空白块的纵坐标
    int step=0;//步数
    public Mainframe(){
        this.addKeyListener(this);
        //初始化界面
        initframe();
        exchange();
        //绘制界面
        paintView();
        setVisible(true);
    }

    public void initframe(){

        //创建窗口，基础设置
        setTitle("石头迷阵单机版v1.0");
        setLayout(null);//取消默认布局
        setSize(514,595);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);//设置窗体置顶
        setLocationRelativeTo(null);//设置窗体居中

    }
    /*
      此方法用于绘制游戏界面
     */
    public void paintView(){
        getContentPane().removeAll();
        //判断是否胜利
        if( Arrays.deepEquals(data,win)){
            JLabel win=new JLabel(new ImageIcon("F:\\新建文件夹\\image\\win.png"));
            win.setBounds(124,230,266,88);
            add(win);

        }
        //设置步数
        JLabel step1=new JLabel("步数："+this.step);
        step1.setBounds(50,20,100,20);
        add(step1);

        //重新开始按键创建
        JButton restart=new JButton("重新开始");
        restart.setBounds(350,20,100,20);
        restart.addActionListener(e->{
            step=0;
            exchange();
            paintView();
        });
        restart.setFocusable(false);
        add(restart);

        //优化后的代码,加载石头图片
        for (int j=0;j<4;j++){
            for (int i=0;i<4;i++){
                JLabel stone=new JLabel(new ImageIcon("F:\\新建文件夹\\image\\"+data[j][i]+".png"));
                stone.setBounds(50+i*100,90+j*100,100,100);
                add(stone);
            }}
        //设置背景图片
        JLabel beijing=new JLabel(new ImageIcon("F:\\新建文件夹\\image\\background.png")) ;
        beijing.setBounds(26,30,450,484);
        add(beijing);

        getContentPane().repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
    //通过keycode来知道
        int keycode=e.getKeyCode();
        move(keycode);
        paintView();
    }
    private void move(int keycode){
        int temp;
        //防止胜利后方块移动
        if( Arrays.deepEquals(data,win)){
            return;

        }
        if (keycode==37){
            if(Y0+1<4){
            temp=data[X0][Y0];
            data[X0][Y0]=data[X0][Y0+1];
            data[X0][Y0+1]=temp;
             Y0++;
                step++;}

        } else if (keycode==38){
            if(X0+1<4){
            temp=data[X0][Y0];
            data[X0][Y0]=data[X0+1][Y0];
            data[X0+1][Y0]=temp;
            X0++;
                step++;}

        }  else if (keycode==39){
            if (Y0-1>=0){
            temp=data[X0][Y0];
            data[X0][Y0]=data[X0][Y0-1];
            data[X0][Y0-1]=temp;
            Y0--;
                step++;}

        }else if (keycode==40){
            if(X0-1>=0){
            temp=data[X0][Y0];
            data[X0][Y0]=data[X0-1][Y0];
            data[X0-1][Y0]=temp;
            X0--;
                step++;
            }}
         else if(keycode==90){
            //作弊器
            //这里数组直接覆盖数据需要类似新建语法
                data = new int [][]{ {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}};}


        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //打乱二维数组
    public void exchange(){
        //准备二次元
        Random r= new Random();
      int RandomX= r.nextInt(4);
      int RandomY= r.nextInt(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                //核心思路，交换用随机的数组元素交换当前元素
                int temp=data[i][j];
                data[i][j]=data[RandomX][RandomY];
                data[RandomX][RandomY]=temp;
            }

        }
        //记录此时0的坐标
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if(data[i][j]==0){
                    X0=i;
                    Y0=j;
                }
            }
        }
      //  System.out.println("X0:"+X0+"Y0:"+Y0);


    }

}
