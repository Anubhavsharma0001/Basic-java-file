package com.JavaInOneVideo.Access_Modifier;

import com.JavaInOneVideo.Access_Modifier.Home_Protected.Room;

public class test {
    public static void main(String[] args) {

       /* ulitis ulitis = new ulitis();

        ulitis.age = 23;
        ulitis.name = "RAM";
        ulitis.sayHello();
        System.out.println(ulitis.age);
        System.out.println(ulitis.name);



        School.getInstance(); //check by debug here
        // Only one time will be true because constructor will be null then always false
        // because it will hold object
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();


        */
        Room room = new Room("BedRoom ");
        room.haveSpace();

        room.changeSpace("Rectangle"); // it's protected that's why we can call
        room.haveSpace();




    }



}
