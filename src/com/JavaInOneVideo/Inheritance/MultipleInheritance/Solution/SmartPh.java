package com.JavaInOneVideo.Inheritance.MultipleInheritance.Solution;

public class SmartPh implements Cam , Music , Phoonnee {
    @Override
    public void takePhoto() {

        System.out.println("Can take photo by smartphone");

    }

    @Override
    public void recordVideo() {

        System.out.println("Can record video by smartphone");

    }

    @Override
    public void playMusic() {

        System.out.println("Playing music on smartphone");

    }

    @Override
    public void stopMusic() {

        System.out.println("Music stop on smartphone");

    }





    @Override
    public void makeCall(String a) {

        System.out.println("Calling " + a + "from Smartphone");

    }

    @Override
    public void endCall(String b) {
        System.out.println("ending call" + b + "From smartphone");

    }

    // By interface we can achieve multiple inheritance
    // If we put interface as class which we have to inhert
}
