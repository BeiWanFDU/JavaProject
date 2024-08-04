package kang.kk.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (iterator.next().equals("2")) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
