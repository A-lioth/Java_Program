package practice.学生管理系统.final_version;

import java.util.ArrayList;
import java.util.Random;
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
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.print("用户名只能包含字母、数字, ");
                return false;
            }
        }
        // username 不能是纯数字
        boolean isAllDigit = true;
        for (char c : username.toCharArray()) {
            if (!Character.isDigit(c)) {
                isAllDigit = false;
                break;
            }
        }
        if (isAllDigit) {
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
            if (!Character.isLetterOrDigit(c)) {
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
        if (id.startsWith("0")) {
            System.out.print("身份证号码第一位不能为 0 , ");
            return false;
        }
        // id 第 18 位只能是 [0-9] 或 X
        if (id.charAt(17) != 'X' && !Character.isDigit(id.charAt(17))) {
            System.out.print("身份证号码第 18 位只能是 [0-9] 或 X , ");
            return false;
        }
        // id 前 17 位只能包含数字
        for (int i = 0; i < 17; i++) {
            if (!Character.isDigit(id.charAt(i))) {
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
        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.print("手机号码只能包含数字, ");
                return false;
            }
        }
        return true;
    }

    private static String enterAndVerifyUsername(ArrayList<User> users, Scanner sc, boolean flag) {
        System.out.println("请输入用户名: ");
        String username = sc.next();
        while (true) {
            // 检查用户名格式
            if (checkUsername(username) == false) {
                System.out.println("请重新输入: ");
                username = sc.next();
                continue;
            }
            // 检查用户名是否已存在
            if (flag == true && isContain(users, username)) {
                System.out.println("用户名 " + username + " 已存在，请重新输入: ");
                username = sc.next();
                continue;
            }
            if (flag == false && !isContain(users, username)) {
                System.out.println("用户名 " + username + " 未注册，请重新输入: ");
                username = sc.next();
                continue;
            }
            break;
        }
        return username;
    }

    private static String enterAndVerifyPassword(Scanner sc) {
        System.out.println("请输入密码: ");
        String pw1 = "";
        String pw2 = "";
        while (true) {
            pw1 = sc.next();
            // 检查密码格式
            if (checkPassword(pw1) == false) {
                System.out.println("请重新输入: ");
                continue;
            }
            System.out.println("请再次输入密码: ");
            pw2 = sc.next();
            // 检查密码格式
            if (checkPassword(pw2) == false) {
                System.out.println("请重新输入: ");
                continue;
            }
            // 检查两次密码是否一致
            if (!pw1.equals(pw2)) {
                System.out.println("两次输入的密码不一致，请重新输入: ");
                continue;
            }
            break;
        }
        return pw1;
    }

    private static String enterAndVerifyId(Scanner sc) {
        System.out.println("请输入身份证号码: ");
        String id = sc.next();
        while (true) {
            // 检查身份证号码格式
            if (checkId(id) == false) {
                System.out.println("请重新输入: ");
                id = sc.next();
                continue;
            }
            break;
        }
        return id;
    }

    private static String enterAndVerifyPhoneNumber(Scanner sc) {
        System.out.println("请输入手机号码: ");
        String phoneNumber = sc.next();
        while (true) {
            // 检查手机号码格式
            if (checkPhoneNumber(phoneNumber) == false) {
                System.out.println("请重新输入: ");
                phoneNumber = sc.next();
                continue;
            }
            break;
        }
        return phoneNumber;
    }

    private static void saveInfoToArrayList(User u, ArrayList<User> users, String username, String password,
            String id, String phoneNumber) {
        u.setUsername(username);
        u.setPassword(password);
        u.setId(id);
        u.setPhoneNumber(phoneNumber);
        users.add(u);
    }

    private static boolean isRegisteredSuccessfully(ArrayList<User> users, User user) {
        for (User u : users)
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())
                    && u.getId().equals(user.getId()) && u.getPhoneNumber().equals(user.getPhoneNumber()))
                return true;
        return false;
    }

    private static void register(ArrayList<User> users, Scanner sc) {
        // 创建新用户
        User u = new User();
        // 输入用户名
        String username = enterAndVerifyUsername(users, sc, true);
        // 输入密码
        String password = enterAndVerifyPassword(sc);
        // 输入身份证号码
        String id = enterAndVerifyId(sc);
        // 输入手机号码
        String phoneNumber = enterAndVerifyPhoneNumber(sc);
        // 保存用户信息
        saveInfoToArrayList(u, users, username, password, id, phoneNumber);
        // 检查是否成功保存
        if (isRegisteredSuccessfully(users, u))
            System.out.println("注册成功！");
        else
            System.out.println("注册失败，请稍后再试！");
    }

    private static String getVerificationCode() {
        // 生成长度为 4 的随机验证码，包含大小写字母和数字
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int c = r.nextInt(62);
            if (c < 10)
                code += (char) ('0' + c);
            else if (c < 36)
                code += (char) ('A' + c - 10);
            else
                code += (char) ('a' + c - 36);
        }
        return code;
    }

    private static void login(ArrayList<User> users, Scanner sc) {
        while (true) {
            // 输入用户名
            String username = enterAndVerifyUsername(users, sc, false);
            // 输入密码
            String password = enterAndVerifyPassword(sc);
            // 输入验证码并验证
            while (true) {
                String rightVerification = getVerificationCode();
                System.out.println("请输入验证码: ");
                System.out.println("验证码为: " + rightVerification);
                String verificationCode = sc.next();
                if (!verificationCode.equals(rightVerification)) {
                    System.out.println("验证码错误，请重新输入！");
                    continue;
                }
                break;
            }
            // 验证用户名和密码
            for (User u : users) {
                if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    System.out.println("登录成功！");
                    StudentManageSysyem.start(sc);
                    return;
                } else {
                    System.out.println("用户名或密码错误，请重新输入！");
                    break;
                }
            }
        }
    }

    private static void forgetPassword(ArrayList<User> users, Scanner sc) {
        User u = null;
        while (true) {
            // 输入用户名
            String username = enterAndVerifyUsername(users, sc, false);
            // 找到users中对应的User对象
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    u = user;
                    break;
                }
            }
            // 输入身份证号码和手机号码并验证
            String id = enterAndVerifyId(sc);
            String phoneNumber = enterAndVerifyPhoneNumber(sc);
            if (!u.getId().equals(id) || !u.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("身份证号码或手机号码错误，请重新输入！");
                continue;
            }
            break;
        }
        // 输入新密码并修改
        u.setPassword(enterAndVerifyPassword(sc));
        System.out.println("密码修改成功！");
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
