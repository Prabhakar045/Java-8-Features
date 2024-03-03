package com.xworkz.java8.method_Referencing;

public class Test5Executor {

    //If implemetation is already aailable that time suppose to call the method by referencing
    static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    static void add(int i, int j) {
        System.out.println(i + j);
    }


    static  void devide(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {

        //Lambda Expression
        Test5 test = (int x, int y) -> {
            System.out.println(x * y);
        };
        test.multiply(2, 3);

        // Method Referencing
        Test5 test5 = Test5Executor::multiply;
        test5.multiply(2, 5);

        AddTest testt = Test5Executor::add;
        testt.add(2, 9);

        DevideTest dvd = Test5Executor::devide;
        dvd.devide(200,20 );

    }
}