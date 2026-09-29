package com.JavaInOneVideo;

public class OOPS_Concept { //

    public static class Car {
        //class

        private String color;

        private String brand ;

        private String model;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        private int year;

        private int speed;

    public static void main (String[] args) {
        // objects

        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2004;
        car.model = "SAFARI";

        System.out.println(car.speed);

        /*
        OOPS --> Types of programming in which we deals with objects and classes

       class is a blueprint, in java we write everything under CLASS

       object is instance of class
       1) Properties 2) Behaviour
         Brand        Accelerate
         Model        Brake
         Color        Indicator
         Max Speed

         Creating methods to show what class can do .// BEHAVIOR

         //In order to put properties like speed , model , and color etc as private , we can only change with getter and setter methods
         //Generate --> getter and setter ---> all fields and okay
         //if we want to remove , remove both

         There are 4 pillars or principle :
         1)Encapsulation : Bunding of data and methods into a single unit. (CAPSULE) (Data Hide) (Getter and Setter)
         2)Inheritance: It allow extend a child class to have properties from parents class //reusability
         3)Polymorphism:(Override) Subclass object can be treated as instance of super class.  Animal dog = new Dog();
         4)Abstraction : Hiding internal complexities , hiding implementation details .



         Similar programming types :
         1) Imperative : Writing code line by line (Language C )
         2) Declarative :
         3) Functional : We can store function under variable






         */



    }

    }
}
