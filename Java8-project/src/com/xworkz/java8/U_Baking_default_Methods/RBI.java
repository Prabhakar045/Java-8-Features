package com.xworkz.java8.U_Baking_default_Methods;

public interface RBI {
    void m1();
    void m2();

    // if we declare one more method in interface we have implement it in all implementation class ,
    // to avoid this default methods are introduced
    // backward compatibility
    default void m3(){

        System.out.println("default method");
    }

    //static method not Overridden bcz it belongs to the particular  class
    // The advntage over static method in interface bcz to provide utility functions & no need to create separate class
    static  void m4(){

        System.out.println("m4 static method");
    }

}
