package kang.kk.Test03;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 23);

        map.put(s1, "anhui");
        map.put(s2, "zhejiang");
        map.put(s3, "jiangsu");

        for (Map.Entry<Student, String> studentStringEntry : map.entrySet()) {
            System.out.println(studentStringEntry.getKey().name);
            System.out.println(studentStringEntry.getValue());
        }
    }
}
