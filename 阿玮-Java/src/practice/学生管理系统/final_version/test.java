package practice.学生管理系统.final_version;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void showMenu() {
        System.out.println();
        System.out.println("1. 登录");
        System.out.println("2. 注册");
        System.out.println("3. 忘记密码？");
        System.out.println("0. 退出");
    }

    private static boolean checkUsername(String username) {
        // username 长度必须在 3 - 12 之间
        if (username.length() < 3 || username.length() > 12) {
            System.out.print("用户名长度必须在 3 - 12 位之间, ");
            return false;
        }
        // username 只能包含字母、数字
        for (char c : username.toCharArray())
            if (Character.isLetterOrDigit(c) == false) {
                System.out.print("用户名只能包含字母、数字, ");
                return false;
            }
        // username 不能是纯数字
        boolean isAllDigit = true;
        for (char c : username.toCharArray())
            if (Character.isDigit(c) == false) {
                isAllDigit = false;
                break;
            }
        if (isAllDigit == true) {
            System.out.print("用户名不能是纯数字, ");
            return false;
        }
        return true;
    }

    private static boolean isContain(ArrayList<User> users, String username) {
        for (User u : users)
            if (u.getUsername().equals(username))
                return true;
        return false;
    }

    private static boolean checkPassword(String password) {
        // password 长度必须在 6 - 12 之间
        if (password.length() < 6 || password.length() > 12) {
            System.out.print("密码长度必须在 6 - 12 位之间, ");
            return false;
        }
        // password 只能包含字母、数字
        for (char c : password.toCharArray())
            if (Character.isLetterOrDigit(c) == false) {
                System.out.print("密码只能包含字母、数字, ");
                return false;
            }
        return true;
    }

    private static boolean checkId(String id) {
        // id 长度必须为 18
        if (id.length() != 18) {
            System.out.print("身份证号码长度必须为 18 位, ");
            return false;
        }
        // id 第一位不能为 0
        if (id.startsWith("0") == true) {
            System.out.print("身份证号码第一位不能为 0 , ");
            return false;
        }
        // id 第 18 位只能是 [0-9] 或 X
        if (id.charAt(17) != 'X' && Character.isDigit(id.charAt(17)) == false) {
            System.out.print("身份证号码第 18 位只能是 [0-9] 或 X , ");
            return false;
        }
        // id 前 17 位只能包含数字
        for (int i = 0; i < 17; i++) {
            if (Character.isDigit(id.charAt(i)) == false) {
                System.out.print("身份证号码前 17 位只能包含数字, ");
                return false;
            }
        }
        return true;
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        // 手机号码长度必须为 11
        if (phoneNumber.length() != 11) {
            System.out.print("手机号码长度必须为 11 位, ");
            return false;
        }
        // 手机号码第一位必须为 1
        if (phoneNumber.charAt(0) != '1') {
            System.out.print("手机号码第一位必须为 1 , ");
            return false;
        }
        // 手机号码只能包含数字
        for (char c : phoneNumber.toCharArray())
            if (Character.isDigit(c) == false) {
                System.out.print("手机号码只能包含数字, ");
                return false;
            }
        return true;
    }

    private static void login(ArrayList<User> users, Scanner sc) {

    }

    private static void register(ArrayList<User> users, Scanner sc) {
        // 创建新用户
        User u = new User();

        // 输入用户名
        System.out.println("请输入用户名: ");
        String username = sc.next();
        while (true) {
            // 检查用户名格式
            if (checkUsername(username) == false) {
                System.out.print("请重新输入: ");
                username = sc.next();
                continue;
            }
            // 检查用户名是否已存在
            if (isContain(users, username) == true) {
                System.out.print("用户名 " + username + " 已存在，请重新输入: ");
                username = sc.next();
                continue;
            }
            break;
        }
        u.setUsername(username);

        // 输入密码
        System.out.println("请输入密码: ");
        while (true) {
            String pw1 = sc.next();
            // 检查密码格式
            if (checkPassword(pw1) == false) {
                System.out.print("请重新输入: ");
                continue;
            }
            System.out.print("请再次输入密码: ");
            String pw2 = sc.next();
            // 检查密码格式
            if (checkPassword(pw2) == false) {
                System.out.print("请重新输入: ");
                continue;
            }
            // 检查两次密码是否一致
            if (pw1.equals(pw2) == false) {
                System.out.print("两次输入的密码不一致，请重新输入: ");
                continue;
            }
            u.setPassword(pw1);
            break;
        }

        // 输入身份证号码
        System.out.println("请输入身份证号码: ");
        String id = sc.next();
        while (true) {
            // 检查身份证号码格式
            if (checkId(id) == false) {
                System.out.print("请重新输入: ");
                id = sc.next();
                continue;
            }
            break;
        }
        u.setId(id);

        // 输入手机号码
        System.out.println("请输入手机号码: ");
        String phoneNumber = sc.next();
        while (true) {
            // 检查手机号码格式
            if (checkPhoneNumber(phoneNumber) == false) {
                System.out.print("请重新输入: ");
                phoneNumber = sc.next();
                continue;
            }
            break;
        }
        u.setPhoneNumber(phoneNumber);

        // 保存用户信息
        users.add(u);
        System.out.println("注册成功！");
    }

    private static void forgetPassword(ArrayList<User> users, Scanner sc) {

    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.println("欢迎使用学生管理系统");
        do {
            showMenu();
            System.out.print("请选择(0 - 3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> login(users, sc);
                case 2 -> register(users, sc);
                case 3 -> forgetPassword(users, sc);
                case 0 -> System.out.println("欢迎下次使用！");
                default -> System.out.println("输入错误，请重新输入");
            }
        } while (choice != 0);
        sc.close();
    }
}
