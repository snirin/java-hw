package ru.otus.hw01;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class HelloOtus {
    public static void main(String... args) {
        Set<Integer> set1 = ImmutableSet.of(1, 2);
        Set<Integer> set2 = ImmutableSet.of(2, 3);
        Set<Integer> set3 = Sets.union(set1, set2);
        System.out.println(set3);
    }
}
