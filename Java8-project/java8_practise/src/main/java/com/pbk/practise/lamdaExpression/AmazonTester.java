package com.pbk.practise.lamdaExpression;

public class AmazonTester {

    public static void main(String[] args) {

        Amazon amazon = (int x,int y) ->{
            int z = x+y;
            System.out.println(z);
        };

        amazon.add(1,2);
    }
}
