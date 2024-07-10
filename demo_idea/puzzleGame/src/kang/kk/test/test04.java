package kang.kk.test;

public class test04 {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim(int a) {
                System.out.println("重写了游泳的方法");
                System.out.println(a);

            }
        }.swim(5);
    }

    public interface Swim {
        public abstract void swim(int a);

    }
}
