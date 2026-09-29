package com.JavaInOneVideo.Static_Java;

// The static keyword in java is used for memory management primarily.
// It can be appiled to variable , methods , blocks  and nested class
// The main concept behind static is that it belongs to the class rathar then instances of class
// The static methods cannot usee non static data member or call non static method directy
// this and super cannot be used im static context, this refer to object and super refer to parent
public class Static {

    public static void main(String[] args) {

        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        System.out.println(Person.count); // Class.count not instance.count
        Person.getCount(); // Static on method
        int c = sum(2,4); // to make a direct call to have sum we use static down there
        // else we have to make a object to access sum here
        System.out.println(c);


    }

    public static  int sum (int a, int b){
        return a  + b;

    }

    // Static block -- they are used for static initialisation in starting , one time setup
    static {
        System.out.println("Hello");
    }
}
