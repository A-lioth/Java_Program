package practice.数字转换为罗马数字;

import java.util.Scanner;

public class test {
    public static String replace(int num) {
        String[] str = { "", "Ⅰ ", "Ⅱ ", "Ⅲ ", "Ⅳ ", "Ⅴ ", "Ⅵ ", "Ⅶ ", "Ⅷ ", "Ⅸ " };
        return str[num];
    }

    public static String convertToRoman(String numStr) {
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            if (c < '0' || c > '9') {
                return "Invalid input";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            int num = numStr.charAt(i) - '0';
            sb.append(replace(num));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要转换的数字:");
        String numStr = sc.next();
        System.out.println("转换结果为: " + convertToRoman(numStr));
        sc.close();
    }
}