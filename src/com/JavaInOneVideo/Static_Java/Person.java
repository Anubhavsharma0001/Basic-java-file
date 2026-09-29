package com.JavaInOneVideo.Static_Java;

public class Person {


    public static int count = 0;  //static -- class attach

    public Person(){
        count++;


    }


    public String name = "Ram";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id ;

    public static void  getCount(){
        System.out.println("Total Person :" + count);

    }

}
