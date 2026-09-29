package com.JavaInOneVideo.Access_Modifier.School;

public class School {
    // i want to make a single object of school
    // for class there are only 2 access modifier -- public and default

    private static School instance;  // static means that school instance uses within School class


    private School(){

    }

    public static  School getInstance(){
        if(instance == null){  //check by debug here
            // Only one time will be true because constructor will be null then always false
            // because it will hold object
            instance = new School();

        }
        return instance;
    }



}
