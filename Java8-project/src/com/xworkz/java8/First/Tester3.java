package com.xworkz.java8.First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bandipura");
        list.add("Banneraatta");
        list.add("Nagarahole");
        list.add("Dandeli");
        list.add("Kaboni");
        list.add("Motane");
        list.add("Hesaragatta");

        //  Consumer<String> consumer = naanu -> System.out.println(naanu);
        // list.forEach(consumer);


        //Collections.sort(list);
        // list.forEach(forestName -> System.out.println(forestName));

        Predicate<String> filterForestName = forestNAme -> forestNAme.equals("Bandipura");

        // filter method always take parameter as predicate
        List<String>  filteredOutput = list.stream().filter(filterForestName ).collect(Collectors.toList());
        System.out.println(filteredOutput);


    }
}
