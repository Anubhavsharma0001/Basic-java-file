package com.JavaInOneVideo.Abstraction;

/*It means hiding internal details
 to declare abstract we write abstract in between access modifier and class name as
 public abstract void tyre();
 If we create a method a abstract method  under a class , means if a subclass is abstract then parent class will also be abstract
public abstract class vehical{ //abstract class
public  abstract void tyre();  //abstract method
//abstract method without body --> abstract method
//abstract method with body --> Concert method
// We can create a object of abstract of parent class just we can take reference
// We can't use private while having method whoch used in child class
//public abstract void tyre(); X not private only in class

 in abstract class , there are instance variable , if they exist to initialise there are constructor
   also one abstract class extend only one class

 */


public class Abstraction  {
    public static void main(String[]args ) {


        Vehical car = new Car(); //we can use Vehical instead of car for the object creation as upcasting
        car.tyre();

        Bike bike = new Bike();
        bike.tyre();


    }




}
