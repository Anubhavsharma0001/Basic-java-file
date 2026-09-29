package com.JavaInOneVideo.Inner_classes;
//Member inner class

public class Truck {

    private String model;  // member

    private boolean isEngineOn;   // member

    public Truck(String model){   // member
        this.model = model;
        this.isEngineOn = (false);

    }

    class Engine{ // INNER CLASSS This will be associated with instance of outer class(truck)
        //  Thhis will behave as member of outer class
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "engine started ");

            }
            else{
                System.out.println(model  + "engine is already on");
            }
        }
        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "engine stopped");
            }
            else {
                System.out.println(model + "engine is already off");
            }

        }
    }

}
