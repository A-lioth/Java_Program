package 正则表达式.预定义字符;

public class Test {
    public static void main(String[] args) {
        // * . 表示任意字符
        // System.out.println("我".matches(".")); // true
        // System.out.println("我".matches("..")); // false
        // System.out.println("我是".matches("..")); // true

        // * \\d 匹配任意数字
        // System.out.println("123".matches("\\d")); // false
        // System.out.println("123".matches("\\d+")); // true
        // System.out.println("abc".matches("\\d")); // false

        // * \\w 匹配任意字母、数字、下划线
        // System.out.println("abc123_".matches("\\w")); // false
        // System.out.println("abc123_".matches("\\w+")); // true

        // * \\W 匹配任意非字母、数字、下划线
        System.out.println("abc123_".matches("\\W")); // false
        System.out.println("abc123_".matches("\\W+")); // false
    }
}
