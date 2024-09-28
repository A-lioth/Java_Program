package 抽象类和抽象方法;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("格林", 1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.drink();
        f.eat();
    }
}

// * 抽象类不能实例化，只能作为父类被继承，而抽象方法是不能被实现的，只能声明，不能定义。
// * 抽象类的子类必须实现父类的所有抽象方法，否则子类也必须定义为抽象类。
// * 抽象类可以有构造方法，也可以有普通方法。
