package practice.不使用除法和取余求商和余数;

public class test {
    // 给定两个正整数 m 和 n，求它们的商和余数。
    public static void get_div_mod(int m, int n) {
        int i = 0;
        int sub = m - n;
        while (sub > 0) {
            sub -= n;
            i++;
        }
        System.out.println("商：" + i + " 余数：" + (m - n * i));
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 3;
        get_div_mod(m, n);
    }
}
