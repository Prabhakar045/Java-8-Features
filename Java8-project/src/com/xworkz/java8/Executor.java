package com.xworkz.java8;

import com.xworkz.java8.interfaces.*;

public class Executor {

    public static void main(String[] args) {
        Amazon amazon = (name) -> System.out.println(name);
        amazon.addUserData("user name added successfully");

        Ajio ajio = (pName) -> System.out.println(pName);
        ajio.addProductIntoCart("product added succesfully");

        Dmart dmart = () -> System.out.println();
        dmart.purchaseProducts();

        Adddition adddition = (x,y) -> System.out.println(x+y);
        adddition.add(2,3);

        IRCTC irctc = (book) -> System.out.println(book);
        irctc.bookTicket("ticket booked succesfully");

        Indigo indigo = (price) -> System.out.println("ticket price"+price);
        indigo.ticketBooking(3500.00);

        NammaMetro nammaMetro = (source, destination) -> System.out.println(source + destination);
        nammaMetro.choose("rajajinagara", "RV Road");

    }
}
