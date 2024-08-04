package kang.kk.Test;

import java.util.ArrayList;

public class ListUtil {
    //私有化成员方法, ListUtil是一个工具类
    private ListUtil() {
    }

    public static <E> void addAll1(ArrayList<E> list, E e1, E e2, E e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    public static <E> void addAll2(ArrayList<E> list, E... e) {
        for (E e1ement : e) {
            list.add(e1ement);
        }
    }

}
