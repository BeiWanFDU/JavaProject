package kang.kk.test01;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的狗狗抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("Dog is looking home");
    }
}
