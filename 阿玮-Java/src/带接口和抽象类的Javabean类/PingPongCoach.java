package 带接口和抽象类的Javabean类;

public class PingPongCoach extends Coach implements English {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教学");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练正在说英语");
    }
}
