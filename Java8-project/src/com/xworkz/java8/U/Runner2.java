package com.xworkz.java8.U;

public interface Runner2 {

//    changes in Interface after Java8
     public  abstract void display();

     //before java 8 default & static methods in interface are not allowed
    // Oracle developers introduced default methods after java8 bcz Backward  compatibility
     default  void show(){

         System.out.println("default method of interface");
     }
     static void add(){

         System.out.println("static method of an interface");
     }
}
