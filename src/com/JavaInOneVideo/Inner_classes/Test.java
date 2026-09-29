package com.JavaInOneVideo.Inner_classes;

public class Test {
    public static void main(String[] args) {
        Truck truck = new Truck("Tata ");
        Truck.Engine engine = truck.new Engine();  // new engine is created with instance of outer class
        engine.start();
        engine.stop();
    }

}

