package cn.edu.nmu;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        // * 设置窗口大小
        this.setSize(488, 430);
        // * 设置窗口标题
        this.setTitle("拼图游戏-登录");
        // * 设置窗口剧中
        this.setLocationRelativeTo(null);
        // * 设置窗口置顶
        this.setAlwaysOnTop(true);
        // * 设置窗口关闭的方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
