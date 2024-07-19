package 阿玮_java.practice.回文;

public class test {
    public static boolean isPalindrome(int n) {
        int prev = n;
        int cur = 0;
        while (prev > 0) {
            cur = cur * 10 + prev % 10;
            prev /= 10;
        }
        return n == cur;
    }
    public static void main(String[] args) {
        int n = 1231;
        System.out.println(isPalindrome(n));
    }
}
