package com.JavaInOneVideo.Interfaces;

public class Test {
    public static void main(String[] args) {

        Chair chair = new Chair();

        chair.waste();

        Table table = new Table();

        table.waste();

        System.out.println(Chair.amtWaste);

        System.out.println(Plastic.amtWaste); // we can also access through interface

        Plastic.info();

        //Chair.info();  we cannot access static method by subclass , it can only access though interfaces

        //Default method

        table.mould(); // not by interface , by implemented class
        chair.mould();





    }
}
