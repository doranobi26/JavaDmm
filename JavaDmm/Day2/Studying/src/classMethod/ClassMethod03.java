package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
        Human03 yamada = new Human03();

        System.out.println("私の名前は、" + yamada.nogizaka + "です。");
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        yamada.greet("白石麻衣");
        yamada.greet(null);
    }

}
