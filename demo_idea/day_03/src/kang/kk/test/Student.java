package kang.kk.test;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + "is studying");
    }

    public void show() {
        System.out.println(name + age + gender);
    }

}
