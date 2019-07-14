package ru.otus.hw02;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Integer> list = new DIYarrayList<>();

        for (int i = 50; i > 0; i--) {
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);

        List<Integer> list1 = new DIYarrayList<>();
        for (int i = 0; i < 50; i++) {
            list1.add(0);
        }
        System.out.println(list1);
        Collections.copy(list1, list);
        System.out.println(list1);

        Collections.addAll(list1, 60, 70, 80);
        System.out.println(list1);
    }
}
