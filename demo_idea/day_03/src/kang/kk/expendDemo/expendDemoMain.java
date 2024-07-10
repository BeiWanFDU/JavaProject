package kang.kk.expendDemo;

public class expendDemoMain {
    public static void main(String[] args) {

    }
}

class Student {
    String name;
    int age;
    String school;

    //需求：
    //默认为传智大学
    public Student() {
        //表示调用本类其他构造方法
        //细节：虛拟机就不会再添加super();
        //必须写在第一行
        this(null, 0, "传智大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}