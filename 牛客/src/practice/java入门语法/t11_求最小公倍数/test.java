package practice.java入门语法.t11_求最小公倍数;

import java.util.Scanner;

public class test {
    public static int getCM(int m, int n) {
        int max = m > n ? m : n;
        for (int i = max; i <= m * n; i++)
            if (i % m == 0 && i % n == 0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
        console.close();
    }
}