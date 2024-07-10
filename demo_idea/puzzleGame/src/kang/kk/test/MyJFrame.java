package kang.kk.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jtb1 = new JButton("按钮");
    JButton jtb2 = new JButton("按钮");

    public MyJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        // 创建一个按钮对象
        jtb1.setBounds(0, 0, 100, 50);
        jtb1.addActionListener(this);

        jtb2.setBounds(200, 200, 100, 50);
        jtb2.addActionListener(this);

        jFrame.getContentPane().add(jtb1);
        jFrame.getContentPane().add(jtb2);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object resorce = e.getSource();
        if (resorce == jtb1) {
            jtb1.resize(200, 200);
        } else if (resorce == jtb2) {
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}
