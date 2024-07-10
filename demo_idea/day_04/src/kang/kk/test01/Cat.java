package kang.kk.test01;

public class Cat extends Animal implements Swim {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的猫咪抱住" + something + "猛吃");
    }

    public void catchMosue() {
        System.out.println("Cat is catching mouse");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }
}
