package com.JavaInOneVideo.Inheritance;

public class Animal {

    /*Single Inheritance -->in which a child class inherit their parent class properties .


     */

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("This animal eats food.");
    }

    public void sayHello(){
        System.out.println("Hello");
    }






}
