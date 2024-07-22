package practice.文字版格斗游戏;

public class test {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100);
        Role r2 = new Role("鸠摩智", 100);

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() <= 0) {
                System.out.println(r1.getName() + " 胜利！");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() <= 0) {
                System.out.println(r2.getName() + " 胜利！");
                break;
            }
        }
    }
}
