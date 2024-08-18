package practice.java入门语法.t30_统计字符串中字母出现次数;

import java.util.Scanner;

public class test {
    public static int check(String str, String word) {
        return str.length() - str.replace(word, "").length();
    }
    public static void main(String[] args) {
        String str = "hello world";
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        System.out.println(check(str, word));
    }
}
