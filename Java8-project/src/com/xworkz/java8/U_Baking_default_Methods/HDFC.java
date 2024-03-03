package com.xworkz.java8.U_Baking_default_Methods;

public class HDFC implements RBI{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

        RBI.super.m3();
    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.m3();   // accessing default method of ineterface
    }
}
