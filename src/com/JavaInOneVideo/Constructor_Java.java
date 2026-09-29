package com.JavaInOneVideo;

// we declare constructor as without any return type
// same name as class name
// Example : public Student(){}

public class Constructor_Java {


    public static class Student {

        private int Age ;
       String name ;
         int roll_number;

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            this.Age = age;
        }

        public int getRoll_number() {
            return roll_number;
        }

        public void setRoll_number(int roll_number) {
            this.roll_number = roll_number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }





        public Student(String name, int Age , int roll_Number) //Come under student class , custom constructor,method name will be same as class name
         {
             this.name = name;
             this.roll_number = roll_Number;
             this.Age = Age;    // default value as 10 as age if we don't put anny value


         }

    }



    public static void main(String[] args) {

        Student student = new Student("Ram",11,12); // Student()-->Constructor

        /*Constructor is a special methods used to initialise the object , creating object
         It is used to set values.
         Default constructor is used initialise objects, used to set default values.(no parameter)
         Parameterise constructor used to take 2 or more parameters

         */
        System.out.println(student.getAge()); //comes as 10 bcz it take default constructor value also it is overloading
        System.out.println(student.getName());
        System.out.println(student.getRoll_number());

    }


    //when we are not putting our constructor , then default constructor will run but if we put our constructor then default constructor will not run at all.




    }

