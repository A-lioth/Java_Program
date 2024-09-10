package 继承中成员变量和方法的访问;

public class test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.zishow();
    }
}

class Fu {
    String name = "fu";

    public void eat() {
        System.out.println("fu eat");
    }
}

class Zi extends Fu {
    String name = "zi";

    @Override
    public void eat() {
        System.out.println("zi eat");
    }

    public void zishow() {
        String name = "zishow";
        // 就近原则
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        // 访问父类方法
        eat();
    }
}