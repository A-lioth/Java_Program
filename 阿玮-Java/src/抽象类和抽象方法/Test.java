package 抽象类和抽象方法;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("格林", 1);
        System.out.println(f.getName() + ", " + f.getAge() + " 岁");
        f.drink();
        f.eat();
        f.swim();
        Sheep s = new Sheep("赛普", 2);
        System.out.println(s.getName() + ", " + s.getAge() + " 岁");
        s.drink();
        s.eat();
    }
}

// * 抽象类不能实例化，只能作为父类被继承，而抽象方法是不能被实现的，只能声明，不能定义。
// * 抽象类的子类必须实现父类的所有抽象方法，否则子类也必须定义为抽象类。
// * 抽象类可以有构造方法，也可以有普通方法。

// * 接口中成员的特点
// * 成员变量
// * 1. 只能是常量
// * 2. 默认修饰符是public static final，不能被修改。
// * 成员方法
// * 1. 只能是抽象方法
// * 2. 成员方法的默认修饰符是public abstract，不能被实现。
