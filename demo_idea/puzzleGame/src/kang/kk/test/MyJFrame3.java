package kang.kk.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
        this.setSize(800, 600);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        //给整个窗体添加键盘监听
        //调用者this：本类对象，当前的界面对象，表示我要给鉴个界面添加监听
        //addKeyListener：表示要给本界面添加键盘监听
        //参数this：当事件被触发之后，会执行本类中的对应代码
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //细节1：
    //如果我们按下一个按键没有松开，那么会重复的去调用keyPressed方法
    //细节2：
    //键盘里面那么多按键，如何进行区分？
    //每一个按键都有一个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        // 获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        if (code == 65) {
            System.out.println("Press A");
        } else if (code == 66) {
            System.out.println("Press B");
        }
    }
}
