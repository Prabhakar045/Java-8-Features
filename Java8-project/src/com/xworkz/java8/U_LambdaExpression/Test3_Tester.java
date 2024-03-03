package com.xworkz.java8.U_LambdaExpression;

public class Test3_Tester {

    public static void main(String[] args) {
        String s ="Prabhakar";

        // Using Lambda expression we does not need to implement interface & override method

        /*
        Test3 test3 = void add(int x, int y)  {
            //implemetation
            int z = x+y;
            System.out.println(z);
        };
        */
        // instead of writing like above we remove method name & add -> this after arguments

        Test3 test3 = (int x, int y) -> {   // arguments
            //implemetation
            int z = x+y;
            System.out.println(z);
        };

        test3.add(10,20); // like normal method calling


        Test4 test4 = () -> {
            System.out.println("Hello java 8");
        };

        test4.print();  // like normal method calling
    }
}
