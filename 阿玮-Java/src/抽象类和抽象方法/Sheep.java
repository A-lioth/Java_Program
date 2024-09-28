package 抽象类和抽象方法;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }
}
