package com.xworkz.java8.U;

public class Runner implements Runner1 {

    final int i;  // blanck final variable

    // class have a constructor it means it works on state of an object
    public Runner(int i){   // constructor used to initialize value to the above var
        this.i = i;
    }

    public static void main(String[] args) {

        Runner a = new Runner(10);
        Runner a1= new Runner(20);

        System.out.println(a.i +"\n"+a1.i);

//        Runner1.i=20;   // if we try to modify value it provide an Error - Cannot assign a value to final variable 'i'
    }
}
