package practice.java入门语法.t15_计算整数位数;

import java.util.Scanner;

public class test {
    public static void func(int num) {
        System.out.println((num + "").length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        func(num);
        sc.close();
    }
}
