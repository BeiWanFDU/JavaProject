package kang.kk.Test;

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}

public class Test01 {
    public static void main(String[] args) {
        //1.利用匿名内部类去调用
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("Swimming");
            }
        });

        //2.利用lambda表达式改写
        method(() -> {
                    System.out.println("Swimming");
                }
        );


    }

    public static void method(Swim s) {
        s.swimming();
    }
}