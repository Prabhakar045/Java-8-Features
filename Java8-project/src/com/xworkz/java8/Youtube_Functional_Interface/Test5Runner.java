package com.xworkz.java8.Youtube_Functional_Interface;

public class Test5Runner {

    public static void main(String[] args) {

        // If u have multiple abstract method in interface , Compiler will go in ambiguity that for which method it have to provide implemetation
       // so functional interface is introduced in java
        Test5 test5 = (name) -> {
            System.out.println(name);
        };

        test5.print("obk");
    }
}
