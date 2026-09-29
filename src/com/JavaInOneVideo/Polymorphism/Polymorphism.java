package com.JavaInOneVideo.Polymorphism;

public class Polymorphism {

    /*Polymorphism(Many forms ) is a core concept of OOPS that allow
     methods to do different things based on the object is acting upon ,
     even though the method name and signature might be the same .
     it will act differently based on where it is called .cahhe method name or signature name same ho .

     There are two types of polymorphism :
     1) Compiletime polymorphism (Method overloading)
     2) Runtime Polymorphism (Method Overriding)





    //Example of CompilerTime polymorphism(method overloading)
    //It will decided on compile time which method is used


    static class Calculator{
        //method of add two numbers
        public int add(int a, int b ){
            return a+b;

        }
        //Method of add three integer
        public int add (int x, int y , int z ){
            return x + y +z;
        }

        //Method of add two double values
        public double add (double a , double b ){ // Method overloading due to first method just changed datatypes
            return a + b;

        }


    }

    public static void main() {
        Calculator calc  = new Calculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5,10,15));
        System.out.println(calc.add(5.5,10.5));

    }

     */
    //RunTime Polymorphism(Inheritance) --(Overriding)(Dynamic method dispatch)
    // we assign parent class reference in place of child class object creation
    // Also it override the sayHello method to cat and dog with their respective
    //Upcasting (Lower hierarchy to upper hierarchy object )
    // We can't call method in dog to animal

    public static class Animal{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age ;

        public void eat(){
            System.out.println("The animal eats food.");
        }

        public void sayHello(){
            System.out.println("...");
        }

    }

    }

