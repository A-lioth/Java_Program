import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        // * 初始化窗口
        initJFrame();

        // * 初始化图片
        initImage();

        // * 初始化菜单栏
        initJMenuBar();
    }

    private void initJFrame() {
        // * 设置窗口大小
        this.setSize(603, 600);

        // * 设置窗口标题
        this.setTitle("拼图游戏");

        // * 设置窗口居中
        this.setLocationRelativeTo(null);

        // * 设置窗口置顶
        this.setAlwaysOnTop(true);

        // * 设置窗口关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initImage() {
        // * 创建图片
        ImageIcon imageIcon = new ImageIcon("src/images/background.jpg");

        // * 创建JLabel
        JLabel label = new JLabel(imageIcon);
        
        // * 添加JLabel到窗口
        this.add(label);
    }

    private void initJMenuBar() {
        // * 初始化菜单栏
        JMenuBar menuBar = new JMenuBar();

        // * 创建菜单项
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于");

        // * 创建菜单项子项
        JMenuItem replayItem = new JMenuItem("重新开始");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem exitItem = new JMenuItem("退出游戏");

        JMenuItem authorItem = new JMenuItem("作者");

        // * 添加子项到菜单项
        functionMenu.add(replayItem);
        functionMenu.add(reloginItem);
        functionMenu.add(exitItem);

        aboutMenu.add(authorItem);

        // * 添加菜单项到菜单栏
        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        // * 设置菜单栏
        this.setJMenuBar(menuBar);

        // * 显示窗口
        this.setVisible(true);
    }
}
