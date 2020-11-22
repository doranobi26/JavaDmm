package classMethod.human;

public class Human03 {
    public String nogizaka;
    public int age;
    public String profession;

    public Human03() {
        this.nogizaka = "秋元真夏";
        this.age = 27;
        this.profession = "乃木坂４６キャプテン";
    }

    public String getProfile() {
        return "年齢は" + this.age + "、職業は" + this.profession;
    }

    public void greet(String friend) {
        if (friend == null) { //String型の値はnullの可能性があるのでチェック
            System.out.println("挨拶する友達がわかりません！");
            return;
        }
        System.out.println(friend + "さん、こんにちは！");
    }

}
