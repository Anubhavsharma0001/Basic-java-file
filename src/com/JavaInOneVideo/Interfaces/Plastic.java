package com.JavaInOneVideo.Interfaces;

public interface Plastic {

    public abstract void uses();

    void waste();



    int amtWaste = 1000;

    // it will react same
    // public static final int amtWaste = 1000;

    public static void info(){  // it will not work without static
        System.out.println("This is an Plastic Interface ");
    }
//default method

    public default void mould(){
        this.uses();
        System.out.println("It can be moulded ");
    }


}
