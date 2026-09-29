package com.JavaInOneVideo.Interfaces;

public class Table implements Plastic{
    @Override
    public void uses() {

        System.out.println("Used to make table");

    }

    @Override
    public void waste() {
        System.out.println("It create waste to make table");

    }
}
