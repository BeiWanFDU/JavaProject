package kang.kk.test02;

public class Outer {
    private int a = 10;

    public Inner getInstance() {
        return new Inner();
    }

    private class Inner {

    }
}
