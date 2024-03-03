package com.xworkz.java8.interfaces;

@FunctionalInterface
public interface Ajio {

    void addProductIntoCart(String pName);

     default   void  removeProduct(String ProductName){

    }
}
