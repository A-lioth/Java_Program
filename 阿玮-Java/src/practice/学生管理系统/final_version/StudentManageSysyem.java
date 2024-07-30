package practice.学生管理系统.final_version;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSysyem {
    public static void showMenu() {
        System.out.println("学生管理系统");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生信息");
        System.out.println("4. 查询学生信息");
        System.out.println("0. 退出系统");
    }

    public static boolean checkId(ArrayList<Student> stu, String id) {
        for (Student s : stu)
            if (s.getId().equals(id))
                return true;
        return false;
    }

    public static void add(ArrayList<Student> stu, Scanner sc) {
        Student s = new Student();
        System.out.print("请输入学生编号: ");
        String id = sc.next();
        while (checkId(stu, id) == true) {
            System.out.print("该编号已存在，请重新输入: ");
            id = sc.next();
        }
        s.setId(id);
        System.out.print("请输入学生姓名: ");
        s.setName(sc.next());
        System.out.print("请输入学生性别(男/女): ");
        s.setGender(sc.next());
        System.out.print("请输入学生年龄: ");
        s.setAge(sc.nextInt());
        stu.add(s);
        System.out.println("添加成功");
    }

    public static void delete(ArrayList<Student> stu, Scanner sc) {
        System.out.print("请输入要删除的学生编号: ");
        String id = sc.next();
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i).getId().equals(id)) {
                stu.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("该学生不存在");
    }

    public static void modify(ArrayList<Student> stu, Scanner sc) {
        System.out.print("请输入要修改的学生编号: ");
        String id = sc.next();
        for (int i = 0; i < stu.size(); i++) {
            if (stu.get(i).getId().equals(id)) {
                System.out.print("请输入新的学生姓名: ");
                stu.get(i).setName(sc.next());
                System.out.print("请输入新的学生性别(男/女): ");
                stu.get(i).setGender(sc.next());
                System.out.print("请输入新的学生年龄: ");
                stu.get(i).setAge(sc.nextInt());
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("该学生不存在");
    }

    public static void query(ArrayList<Student> stu) {
        if (stu.size() == 0) {
            System.out.println("学生信息库为空");
            return;
        }
        System.out.println("编号\t姓名\t性别\t年龄");
        for (Student s : stu) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getGender() + "\t" + s.getAge());
        }
    }

    public static void start(Scanner sc) {
        int choice = 0;
        ArrayList<Student> stu = new ArrayList<>();
        do {
            System.out.println("欢迎使用学生管理系统");
            showMenu();
            System.out.print("请选择(0-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> add(stu, sc);
                case 2 -> delete(stu, sc);
                case 3 -> modify(stu, sc);
                case 4 -> query(stu);
                case 0 -> System.out.println("欢迎下次使用");
                default -> System.out.println("输入错误，请重新输入");
            }
        } while (choice != 0);
    }
}
