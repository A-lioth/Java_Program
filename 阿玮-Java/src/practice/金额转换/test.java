package practice.金额转换;

import java.util.Scanner;

public class test {
    public static String getCapital(int number) {
        String[] str = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        return str[number];
    }

    public static String getUnit(int number) {
        String[] str = { "佰", "仟", "万", "仟", "佰", "拾", "元" };
        return str[number];
    }

    public static String convert(int money) {
        StringBuilder capital = new StringBuilder();
        while (money > 0) {
            capital.append(getCapital(money % 10));

            money /= 10;
        }
        return capital.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        do {
            System.out.print("请输入正确的金额：");
            money = sc.nextInt();
        } while (money < 1 || money > 9999999);
        System.out.println(convert(money));
        sc.close();
    }
}
