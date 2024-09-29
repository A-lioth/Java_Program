package 带接口和抽象类的Javabean类;

public class PingPongSporter extends Sporter implements English {
    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员正在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员正在学习");
    }
}
