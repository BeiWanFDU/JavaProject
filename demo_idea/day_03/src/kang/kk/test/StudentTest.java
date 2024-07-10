package kang.kk.test;

import java.util.ArrayList;


public class StudentTest {
    public static void main(String[] args) {

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }


        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan", 23, "male");
        Student s2 = new Student("zhangsan", 26, "male");
        Student s3 = new Student("zhangsan", 24, "male");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }

}
