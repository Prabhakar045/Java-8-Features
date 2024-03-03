package com.xworkz.java8.U_Baking_default_Methods;

public class SBI implements RBI{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    void display(){
        RBI.super.m3();
    }

    public static void main(String[] args) {

        //Accessing default method interface & which is not overridden in impl class
        //Syntax - InterfaceName.super.methodName()
        // RBI.super.m3();  -> it is not possible bcz main is static method in which we cannot call instance method

        SBI sbi = new SBI();
        sbi.m3();
        sbi.display();
        RBI.m4(); // way of Calling m4 method of interface
    }
}
