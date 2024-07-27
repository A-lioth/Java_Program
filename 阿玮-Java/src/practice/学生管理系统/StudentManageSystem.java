package practice.学生管理系统;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManageSystem {
    public static void showMenu() {
        System.out.println("学生管理系统");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生信息");
        System.out.println("4. 查询学生信息");
        System.out.println("0. 退出系统");
    }

    public static void add(ArrayList<Student> stu) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生编号: ");
        s.setId(sc.next());
        System.out.print("请输入学生姓名: ");
        s.setName(sc.next());
        System.out.print("请输入学生性别(男/女): ");
        s.setGender(sc.next());
        System.out.print("请输入学生年龄: ");
        s.setAge(sc.nextInt());
        stu.add(s);
        System.out.println("添加成功");
    }

    public static void delete(ArrayList<Student> stu) {
    }

    public static void modify(ArrayList<Student> stu) {
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

    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Student> stu = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("欢迎使用学生管理系统");
            showMenu();
            System.out.print("请选择(0-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> add(stu);
                case 2 -> delete(stu);
                case 3 -> modify(stu);
                case 4 -> query(stu);
                case 0 -> System.out.println("欢迎下次使用");
                default -> System.out.println("输入错误，请重新输入");
            }
        } while (choice != 0);
    }
}
