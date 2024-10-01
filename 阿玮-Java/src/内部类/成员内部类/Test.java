package 内部类.成员内部类;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi);
        // * 调用内部类私有成员的方法
        Outer o = new Outer();
        System.out.println(o.getInner());

        Outer.Inner oi1 = new Outer().new Inner();
        oi1.print();
    }
}
