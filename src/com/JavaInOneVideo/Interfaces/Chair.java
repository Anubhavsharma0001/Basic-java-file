package com.JavaInOneVideo.Interfaces;

public class Chair implements Plastic {
    @Override
    public void uses() {
        System.out.println("It has many uses ");

    }

    @Override
    public void waste() {
        System.out.println("It create too much waste");

    }

}
