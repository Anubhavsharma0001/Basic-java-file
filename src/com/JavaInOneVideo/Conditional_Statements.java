package com.JavaInOneVideo;

public class Conditional_Statements {
    public static void main(String[] args) {

         /*Relational Operators:(on operands )
           It compare two values and return a boolean result.
           1) <, >, <=,>=(larger or equal)
           2) == (equality)
           3) != (not equal to )


        int a = 3;
        int b = 5;
        boolean c = a < b;
        System.out.println(c);


        String str1 = "Pool";
        String str2 = "Pool";
        System.out.println(str1 == str2); // same is true


        String str1 = "Pool";
        String str2 = new String("Pool");
        System.out.println(str1 == str2); // new (False)



        //exam = 100 - 33

        int ramMarks = 35;
        int ramAge = 50 ;
        System.out.println(ramMarks >=33) ;



        //Logical Operator:
                 Take a boolean as input and give a boolean expression

        1)And logical && (Both should be true )
        2) OR logical || (Any one condition should be true)
        3) NOT logical !



        int ramMarks = 35;
        int ramAge = 50 ;
        System.out.println(ramMarks >=33 && ramAge <=30) ;


        String name = "RAM";
        int exp = 2;
        boolean tier1 = true ;
        boolean cond1 = exp >= 5;

        System.out.println(tier1 || cond1);


        //Conditional Statement

        int age = 2;

        if (age >= 18)
        {
            System.out.println("You're Adult");
        }
        else
        {
            System.out.println("kid");
        }


        int age = 0;      // 20
        int marks = 33;   // 33/100

        if(age <=20 && marks<=33)
        {
            System.out.println("Congrats");
        }
        else {
            System.out.println("Better luck next time");
        }


        // Always True

        if (true)
        {
            System.out.println("Hello world");
        }


        //Marks if elsif else ladder

        int marks = 5 ;
        //Marks >= 90 A
        // Marks >= 75 B
        // Marks >= 60 c
        // Marks <= 60 D

        if(marks >= 90)
        {
            System.out.println("GRADE A");
        } else if (marks >= 75) {
            System.out.println("GRADE B");
        } else if (marks >= 60) {
            System.out.println("GRADE C");

        } else if (marks >= 60) {
            System.out.println("GRADE D");

        }
        else
        {
            System.out.println("GRADE E");
        }



        //SWITCH CASE
           can be used on : Byte , short , char , int , String , Enum Types

        int day = 2;


        switch(day)
        {
            case 1 :
            {
                System.out.println("Monday");
                break;
            }
            case 2 :
            {
                System.out.println("Tuesday");
                break;
            }
            case 3 :
            {
                System.out.println("Wednesday");
                break;
            }
            case 4 :
            {
                System.out.println("Thursday");
                break;
            }
            case 5 :
            {
                System.out.println("Friday");
                break;
            }
            case 6 :
            {
                System.out.println("Saturday");
                break;
            }
            case 7 :
            {
                System.out.println("Sunday");
                break;
            }
            default:
            {
                System.out.println("Invalid day");
            }

        }

          */
        // break importance

        int number = 0;

        switch (number) {

            case 1:
            case 2:
            case 3: {
                System.out.println("Number is 1 , 2 or 3");
                break;
            }

            case 4: {
                System.out.println("Number is 4");
            }
            case 5: {
                System.out.println("Number is 5 ");
                break;
            }
            case 6: {
                System.out.println("Number is 6");
                break;
            }
            default: {
                System.out.println("Invalid ");
            }
        }


    }
}
