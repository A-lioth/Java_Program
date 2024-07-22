package practice.文字版格斗游戏;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] maleFaces = { "风流倜傥", "英俊潇洒", "风度翩翩", "英姿飒爽", "面目狰狞" };
    String[] femaleFaces = { "娇艳可人", "沉鱼落雁", "闭月羞花", "相貌平平" };

    String[] attackDescription = {
            "%s使出一招降龙十八掌, 将%s击退了数十步",
            "%s使出七十二路空明拳, 击中了%s的胸口",
            "%s手掌翻飞, 使出一招九阴白骨爪向%s的面门抓去",
            "%s掏出打狗棒, 棒法凌厉，向%s击去",
            "%s使出一阳指，凌厉真气向%s激射而去",
            "%s飞到空中，使出一招满天花雨掷金针，将%s击退"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if (gender == '男')
            this.face = maleFaces[new Random().nextInt(maleFaces.length)];
        else if (gender == '女')
            this.face = femaleFaces[new Random().nextInt(femaleFaces.length)];
    }

    public void attack(Role target) {
        System.out.printf(attackDescription[new Random().nextInt(attackDescription.length)], this.getName(),
                target.getName());
        System.out.println();
        
        int hurt = new Random().nextInt(this.getBlood()) + 1;

        target.setBlood(target.getBlood() - hurt > 0 ? target.getBlood() - hurt : 0);
    }

    public void showInfo() {
        System.out.println("姓名：" + this.getName());
        System.out.println("血量：" + this.getBlood());
        System.out.println("性别：" + this.getGender());
        System.out.println("颜值：" + this.getFace());
    }
}
