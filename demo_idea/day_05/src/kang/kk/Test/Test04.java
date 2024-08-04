package kang.kk.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Test04 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");

        for (String string : s) {
            System.out.println(string);
        }

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });
    }
}
