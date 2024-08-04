package kang.kk.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"a", "aaa", "aa", "aaaa"};

        //1.使用匿名内部类的方法
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        //2.Lambda完整格式
        Arrays.sort(arr, (String o1, String o2) -> {
            return o1.length() - o2.length();
        });

        //3.Lambda省略格式
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

    }
}
