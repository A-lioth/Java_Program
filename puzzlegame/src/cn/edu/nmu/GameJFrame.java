package cn.edu.nmu;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {
    // * 创建二位数组用于存放拼图数据
    int[][] data = new int[4][4];

    public GameJFrame() {
        // * 初始化窗口
        initJFrame();

        // * 初始化菜单栏
        initJMenuBar();

        // * 初始化数据
        initData();

        // * 初始化图片
        initImage();

        // * 显示窗口
        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int tempIndex = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[tempIndex];
            tempArr[tempIndex] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initJFrame() {
        // * 设置窗口大小
        this.setSize(603, 680);

        // * 设置窗口标题
        this.setTitle("拼图游戏");

        // * 设置窗口居中
        this.setLocationRelativeTo(null);

        // * 设置窗口置顶
        this.setAlwaysOnTop(true);

        // * 设置窗口关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // * 取消默认居中
        this.setLayout(null);
    }

    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                // * 创建JLabel
                JLabel label = new JLabel(new ImageIcon("puzzlegame\\image\\animal\\animal3\\" + num + ".jpg"));

                // * 指定图片位置
                label.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // * 给图片添加边框
                label.setBorder(new BevelBorder(BevelBorder.RAISED));
                // * 添加JLabel到窗口
                // * this.add(label);
                this.getContentPane().add(label);
            }
        }
        // * 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
    }

    private void initJMenuBar() {
        // * 初始化菜单栏
        JMenuBar menuBar = new JMenuBar();

        // * 创建菜单项
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于");

        // * 创建菜单项子项
        JMenuItem replayItem = new JMenuItem("重新开始");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem exitItem = new JMenuItem("退出游戏");

        JMenuItem authorItem = new JMenuItem("作者");

        // * 添加子项到菜单项
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(exitItem);

        aboutMenu.add(authorItem);

        // * 添加菜单项到菜单栏
        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        // * 设置菜单栏
        this.setJMenuBar(menuBar);
    }
}
