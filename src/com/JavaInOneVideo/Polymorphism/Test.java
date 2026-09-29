package com.JavaInOneVideo.Polymorphism;


public class Test {
   public static void main(String[] args) {
       Polymorphism.Animal myAnimal = new Polymorphism.Animal();

       DOg dog = new DOg(); // we can write also Animal(Parent class ) dog = new Dog(); We can take refernce of parent class to make new object
       dog.sayHello(); // Same output , as JVM take dog object method

       Cat cat = new Cat();// we assign Animal instead of Cat due to overriding
       cat.sayHello();


       myAnimal.sayHello();






    }
}
