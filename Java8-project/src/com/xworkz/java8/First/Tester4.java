package com.xworkz.java8.First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tester4 {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(8);
        integerList.add(12);
        integerList.add(3);
        integerList.add(10);

        // >5
        List<Integer>  intFilter = integerList.stream().filter(integer -> integer > 5).collect(Collectors.toList());
        System.out.println(intFilter);

        //even
//       Collectors<Integer> even = integerList.stream().collect(Collectors.partitioningBy(integer -> integer % 2 ==0);
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(integer -> integer % 2 ==0)));

        //odd
        List<Integer> odd = integerList.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);

    }
}
