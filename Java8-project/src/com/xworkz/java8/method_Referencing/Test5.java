package com.xworkz.java8.method_Referencing;

@FunctionalInterface
public interface Test5 {

    void multiply(int x, int y);

    default void  devide(String z){
        System.out.println("impl");
    }


}
