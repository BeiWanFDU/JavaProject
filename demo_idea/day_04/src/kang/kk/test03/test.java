package kang.kk.test03;

public class test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        }.swim();

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //在测试类中调用下面的method方法？
        //以前的方式:要自己写一个子类继承Animal类,再创建子类的对象，传递给method方法
//        Dog d = new Dog();
        //如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("重写了eat方法");
                    }
                }
        );
    }

    public static void method(Animal a) {  //Amimal a = 子类对象，多态
        a.eat();
    }

    public interface Swim {
        public abstract void swim();
    }


}

