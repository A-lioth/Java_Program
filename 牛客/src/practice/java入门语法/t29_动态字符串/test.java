package practice.java入门语法.t29_动态字符串;

import java.util.Scanner;

public class test {
    public static String func(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 3; i >= 0; i -= 3) {
            sb.insert(i, ",");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(func(str));
        sc.close();
    }
}
