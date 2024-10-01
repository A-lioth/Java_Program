package 内部类.Javabean类描述汽车;

public class Car {
    String carName;
    int carAge;
    int carColor;

    public void show() {
        // * 外部类要访问内部类的成员变量，需要创建内部类对象来访问
        Engine e = new Engine();
        e.engineName = "宝马X6";
        System.out.println(e.engineName);
        System.out.println(carName);
    }

    public class Engine {
        String engineName;
        int engineAge;

        public void show() {
            // * 内部类可以访问外部类的成员变量，包括私有成员变量
            System.out.println(carName);
            System.out.println(engineName);
        }
    }
}
