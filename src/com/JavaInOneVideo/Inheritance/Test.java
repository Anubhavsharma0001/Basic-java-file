package com.JavaInOneVideo.Inheritance;



import com.JavaInOneVideo.Inheritance.Human.Child;
import com.JavaInOneVideo.Inheritance.Human.Parent;

public class Test {
    static void main() {
        /*

        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("Bruno");
        dog.eat();
        dog.sayHello();

        Cat cat = new Cat();
        cat.setName("Billo");
        cat.sayHello();

        Child child = new Child();
        child.setAge(18);
        child.setName("Anubhav");

        Parent parent = new Parent();
        parent.setName("Daddy");
        parent.setAge(50);

         */
        Child child = new Child();  // firstly it give output as grandparent ..... because we initialise in starting that it will be default .
        // so it comes from grandparent to parent to child , if there is anything like powers

        child.setAge(12);
        System.out.println(child.isHasSuperPowers());
        child.childMethod();



        /*Super --> Calling Constructor,Parent class, First statement of constructor body!!
         with the help of super we can call parameterise constructor of parent class
         new --> dynamic allocation , heap , during runtime


         */


    }
}
