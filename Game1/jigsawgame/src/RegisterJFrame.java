import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame() {
        // * 设置窗口大小
        this.setSize(488, 500);
        // * 设置窗口标题
        this.setTitle("拼图游戏-注册");
        // * 设置窗口居中
        this.setLocationRelativeTo(null);
        // * 设置窗口置顶
        this.setAlwaysOnTop(true);
        // * 设置窗口关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
