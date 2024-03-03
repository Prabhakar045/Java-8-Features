package com.xworkz.java8.First;

import java.util.*;
import java.util.function.Consumer;

public class Tester1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(3);
        list.add(10);

        Optional<List<Integer>> optional  = Optional.ofNullable(list);
        System.out.println(optional.get());

 /*
        int sum = 0;
        for (int num : list) {

            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println( sum);

        Collections.sort(list);

  */
        Consumer<Integer> consumer = naanu -> System.out.println(naanu);
        list.forEach(consumer);

        System.out.println("***********************");
        // above code is equilent to below code
        list.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }
}
