package practice.java入门语法.t12_小球走过的路程;

import java.util.Scanner;

public class test {
    public static void func(float h, int n) {
        float sum = 0;
        while (n > 0) {
            sum += h;
            h /= 2;
            n--;
            sum += h;
        }
        sum -= h;
        System.out.println(String.format("%.3f", h) + " " + String.format("%.3f", sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        int n = sc.nextInt();
        func(h, n);
        sc.close();
    }
}
