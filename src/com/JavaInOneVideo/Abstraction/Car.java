package com.JavaInOneVideo.Abstraction;

public class Car extends Vehical {

    // we can implement method which is declared in parent class (vehical)
    @Override
    public void accelerate() {

    }

    @Override
    public void deaccelerate() {

    }

    @Override
    public void tyre(){
        System.out.println("Four");
    }
}
