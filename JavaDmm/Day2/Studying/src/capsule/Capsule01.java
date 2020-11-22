package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
    public static void main(String[] args) {
        HumanNoCapsule human1 = new HumanNoCapsule("横山みずき", 24);
        human1.name = "大西由麻";
        human1.age = 25;
        System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");

        HumanCapsule human2 = new HumanCapsule("前村葉子", 65);
        // human2.name = "三村";
        System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
        human2.setName("高田幸美");
        System.out.println("変更した名前は" + human2.getName() + "です。");
    }
}
