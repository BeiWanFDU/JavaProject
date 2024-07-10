package kang.kk.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    JButton jtb1 = new JButton("按钮");
    JButton jtb2 = new JButton("按钮");

    public MyJFrame2() {

        this.setSize(800, 600);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        jtb1.setBounds(0, 0, 100, 50);
        jtb1.addMouseListener(this);

        this.getContentPane().add(jtb1);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Press");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Release");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exit");
    }
}
