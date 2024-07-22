package practice.文字版格斗游戏;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role target) {
        Random random = new Random();
        int hurt = random.nextInt(this.getBlood()) + 1;

        target.setBlood(target.getBlood() - hurt > 0 ? target.getBlood() - hurt : 0);

        System.out.println(this.getName() + "攻击了" + target.getName() + "，造成了" + hurt + "点伤害！" + target.getName()
                + "剩余血量：" + target.getBlood());
    }
}
