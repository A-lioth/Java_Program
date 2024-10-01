package 内部类.成员内部类;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void print() {
            int a = 30;
            // ! Outer.this 获取外部类对象的地址
            // * 10
            System.out.println(Outer.this.a);
            // * 20
            System.out.println(this.a);
            // * 30
            System.out.println(a);
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}
