package com.xworkz.java8.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Tester5 {

    public static void main(String[] args) {

        List<String> list = null;
        List<String> list1 = Arrays.asList("no data found");

        Optional<List<String>> forestName  = Optional.ofNullable(list);
        System.out.println(forestName.get());

        Supplier<NameNotFoundException> supplier = NameNotFoundException::new;
        supplier.get();
        forestName.orElseThrow(supplier);

        forestName.orElseThrow((NameNotFoundException::new));  // constructor referencing
//        or
//        forestName.orElseThrow((e -> NameNotFoundException));


        System.out.println( forestName.orElse(list1));

        //of
        //ofNullable
        //isPresent

    }
}