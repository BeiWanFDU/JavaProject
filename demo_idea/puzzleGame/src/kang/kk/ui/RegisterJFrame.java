package kang.kk.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame() {
        // 设置界面宽高
        this.setSize(488, 500);
        // 设置界面的标题
        this.setTitle("Kang Kang Register V1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 让界面显示出来，一般写在最后
        this.setVisible(true);
    }
}
