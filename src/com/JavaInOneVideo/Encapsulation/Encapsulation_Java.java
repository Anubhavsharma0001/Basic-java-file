package com.JavaInOneVideo.Encapsulation;

public class Encapsulation_Java {
    /*

    public static  class Student {


        //properties and behavior // fields // instance variable

        private String name;

        private int roll_Number;

        private int age;   //make it private that will not br change anywhere else

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll_Number() {
            return roll_Number;
        }

        public void setRoll_Number(int roll_Number) {

            if (roll_Number >= 0) {
                this.roll_Number = roll_Number;
            }
            else {
                System.out.println("Invalid Roll Number");
            }
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public void setAge(int x)     //set
        {
            if (x < 0)
            {
                x = 0;

            }
            this.age = x; // this is used to indicate some specific

        }
        public int getAge()   //get
        {
            return this.age;


        }


        String Address;
    }


    public static void main(String[] args) {

        Student student = new Student();

        student.setName("RAM");
        student.setAge(245);
        student.setRoll_Number(-26);
        student.setAddress("INDIA");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRoll_Number());
        System.out.println(student.getAddress());
    }

     */

    public static void main(String[] args ) {
        Bank_Encapsulation bankAccount = new Bank_Encapsulation();
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw( 10);
        System.out.println(bankAccount.getBalance());


    }


    }





