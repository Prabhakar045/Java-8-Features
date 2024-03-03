package com.xworkz.java8.First;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Tester6 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(null,1,2,3,4);
        Optional<List<Integer>> optional  = Optional.ofNullable(list);
        System.out.println(optional.get());

    }
}
