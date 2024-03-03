// Multiplicator.java
package com.xworkz.java8.First;

@FunctionalInterface
public interface Multiplicator {

    //abstract
    void print(String i);

    //default method
    // static & default methods which contains implementation
    default void multiply(int x, int y) {
        System.out.println(x + y);
    }
}
