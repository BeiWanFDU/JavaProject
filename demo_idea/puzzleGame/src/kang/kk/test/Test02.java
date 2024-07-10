package kang.kk.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test02 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        // 创建一个按钮对象
        JButton jtb = new JButton("按钮");
        jtb.setBounds(0, 0, 100, 50);

        //给按钮添加动作监听
        jtb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click and space");
            }
        });

        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);
    }
}
