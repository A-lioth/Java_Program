package 正则表达式.字符类;

public class Test {
    public static void main(String[] args) {
        
        // * a, b, c 三个字符中只能出现一个
        // System.out.println("-------------------------------");
        // System.out.println("a".matches("[abc]")); // true
        // System.out.println("ab".matches("[abc]")); // false
        // System.out.println("ab".matches("[abc][abc]")); // true
       
        // * 不能出现 a, b, c 三个字符中的任何一个
        // System.out.println("-------------------------------");
        // System.out.println("a".matches("[^abc]")); // false
        // System.out.println("ab".matches("[^abc]")); // false
        // System.out.println("ab".matches("[^abc][^abc]")); // false
        // System.out.println("dd".matches("[^abc][^abc]")); // true

        // * a-z 和 A-Z 范围
        // System.out.println("-------------------------------");
        // System.out.println("a".matches("[a-zA-Z]")); // true
        // System.out.println("aa".matches("[a-zA-Z]")); // false
        // System.out.println("aa".matches("[a-zA-Z][a-zA-Z]")); // true
        // System.out.println("1".matches("[a-zA-Z]")); // false
        // System.out.println("1".matches("[a-zA-Z0-9]")); // true

        // * a-c 或 A-C 范围
        // System.out.println("-------------------------------");
        // System.out.println("a".matches("[a-c[A-C]]")); // true
        // System.out.println("A".matches("[a-c[A-C]]")); // true
        // System.out.println("d".matches("[a-c[A-C]]")); // false
        // System.out.println("aC".matches("[a-c[A-C]]")); // false
        // System.out.println("aC".matches("[a-c[A-C]][a-c[A-C]]")); // true

        // * 两个范围的交集
        // System.out.println("-------------------------------");
        // System.out.println("a".matches("[a-z&&[$%^]]")); // false
        // System.out.println("&".matches("[a-z&[$%^]]")); // true

        // * a-z 范围，但不包括 a 和 z
        System.out.println("-------------------------------");
        System.out.println("b".matches("[a-z&&[^az]]")); // true
        System.out.println("ah".matches("[a-z&&[^bc]][h-z]")); // true
    }
}
