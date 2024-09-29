package 带接口和抽象类的Javabean类;

public class Test {
    public static void main(String[] args) {
        PingPongSporter pps = new PingPongSporter("小魔王", 21);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
        BasketballSporter bbs = new BasketballSporter("坤哥", 20);
        System.out.println(bbs.getName() + ", " + bbs.getAge());
        bbs.study();
    }
}
