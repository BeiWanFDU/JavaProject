package kang.kk.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    // 加载图片时，根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    // 记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    String path = "puzzleGame/image/animal/animal2/";

    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int step = 0;

    JMenuItem replayItem = new JMenuItem("Function");
    JMenuItem reLoginItemItem = new JMenuItem("Re-Login");
    JMenuItem closeItemJItem = new JMenuItem("Close");
    JMenuItem accountJItem = new JMenuItem("Public-Account");

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据
        initData();

        //初始化图片
        initImage();

        // 让界面显示出来，一般写在最后
        this.setVisible(true);
    }

    private void initData() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }
    }

    private void initImage() {
        // 清除原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("puzzleGame/image/win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("Step Count: " + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                // 创建一个JLable对象
                JLabel jLabel1 = new JLabel(new ImageIcon(path + num + ".jpg"));
                // 指定图片位置
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 添加边框
                jLabel1.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel1);
            }
        }

        // 先加载的图片在上方，后加载的图片塞在下面
        // 加载北背景图片
        JLabel background = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About");


        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItemItem);
        functionJMenu.add(closeItemJItem);
        aboutJMenu.add(accountJItem);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

        replayItem.addActionListener(this);
        reLoginItemItem.addActionListener(this);
        closeItemJItem.addActionListener(this);
        accountJItem.addActionListener(this);
    }

    private void initJFrame() {
        // 设置界面宽高
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("Kang Kang Game V1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中位置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        // 添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            JLabel background = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        // 对上下左右进行判断
        // 左37上38右39下40
        int code = e.getKeyCode();

        if (code == 37) {
            System.out.println("左");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();

        } else if (code == 38) {
            System.out.println("上");
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();

        } else if (code == 39) {
            System.out.println("右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }

    }

    //判断data数组是否和win数组中相同
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            step = 0;
            initData();
            initImage();
        } else if (obj == reLoginItemItem) {
            System.out.println("重新登陆");
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItemJItem) {
            System.out.println("关闭");
            System.exit(0);
        } else if (obj == accountJItem) {
            System.out.println("public Account");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame/image/about.png"));
            //设罝位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344, 344);
            //让弹框罝页
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }
}
