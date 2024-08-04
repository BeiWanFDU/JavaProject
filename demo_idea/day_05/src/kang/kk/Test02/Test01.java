package kang.kk.Test02;

import java.util.List;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        //1.创建不可变的List集合
        List<String> list = List.of("zhangsan", "lisi", "wangwu");

        //2.创建不可变的Set集合
        Set<String> set1 = Set.of("zhangsan", "lisi", "wangwu");
        //报错,当我们要获取一个不可变的set集合时, 里面的参数一定要保证唯一性
        Set<String> set2 = Set.of("zhangsan", "zhangsan", "lisi", "wangwu");

        //3.创建不可变的Map集合
        //细节1：键是不能重复的
        //细节2：Map里面的of方法，参数是有上限的，最次只能传递20个参数，10个键值对
        //如果我们要传递多个键值对对象，数量大于10个，在Map按口中还有一个方法Map.ofEntries()

    }
}
