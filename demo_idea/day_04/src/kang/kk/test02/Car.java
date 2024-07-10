package kang.kk.test02;

public class Car { //外部类
    String carName;
    int carAge;
    int carColor;

    //静态内部类
    static class Engine {
        public void show() {
            System.out.println();
        }
    }
}

