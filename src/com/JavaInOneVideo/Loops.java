package com.JavaInOneVideo;

public class Loops {
    public static void main(String[] args) {

        /*Type of loops :
            1) For (less lines , more readable )
                2) While (condition)(Until condition is true statement will print )
                3) Do while


        // While Loop (Until condition is true statement will print)

        Iniialisation
        while(condition)
        {
        //Update
        statement
        }


        Infinite loops:because condition is always true

        int i = 0;
        while (i == 0)
        {
            System.out.println("Hello World ");
        }


        int i = 1; //debug point
        while (i < 10)
        {
            System.out.println(i);
            i = i +1;
        }


        // Do-While Loop :
           First  run ,print the statement ...........  then it check condition

        int i = 100;

        do {
            System.out.println(i);
            i++;

        }
        while (i <= 50);



        //For Loop
        for (Initialisation ; conition ; update)
        {
            //code
        }


        for(int j = 0 ;j <=10 ; j++ )
        {
            System.out.println(j);
        }

         Question:1
         * 1
         * 10
         * 100
         * 1000
         * 10000
         * 100000


        for( int i = 1; i <=100000 ; i = i * 10 )
        {
            System.out.println(i);

        }

        Question : 2

        1
        12
        123
        1234
        12345
        123456
 n
        for (int i = 1; i <=6 ; i = i +1)
        {
            System.out.println(i);
        }



         Question : 3
         * 1
         * 10
         * 100
         * 1000
         * 10000
         * 100000

        for (int i = 1, j = 1 ; j <=6 ; i = i * 10,j++)
        {
            System.out.println(i);
        }


        //Table of 7

       for (int i = 0; i <= 10 ; i++)
       {
           System.out.println( "7 x " + i +  " = " +  i * 7);
       }




        // Table of -59

        for (int i = 0 ; i <= 10 ; i ++)
        {
            System.out.println("-59 x " + i +  " = " +  i * - 59 );
       }


        //sum of n natural numbers(while)

        int sum = 0 ;
        int i = 1;

        while(i <=10)
        {
            sum = sum + i;
            i ++;
            System.out.println(sum);

        }



        //Print natural number with for loop

        int sum =0;

        for(int i = 1; i <=10;i++)
        {
             sum = sum + i;
            System.out.println(sum);
        }


        //counting digit of a number

        int n = 5456864;

        int res = 0;
        while(n>0)
        {
            n = n/10;
            res++;

        }
        System.out.println(res);


        // with for loop

        int n = 536546;
        int count = 0;
        for(int i = 0; i <=n;i++ )
        {
            n = n / 10;
            count++;
        }
        System.out.println(count);


        //Factorial
        int fact = 1;
        int n = 9;
        while(n > 0)
        {
            fact = fact * n;

            n--;

        }
        System.out.println(fact);

        // with for loop
         int fact = 1;
         int n = 9;
         for(int i = n ; i > 0 ;i--)
         {
             fact = fact * i;
             System.out.println(fact);
         }


         // How much my loops runs
        int count = 0;
        for (int i =0; i < 10; i ++)
        {
            for(int j = 0;j<10;j++)
            {
                count++;
            }
        }
        System.out.println(count);


        //Pattern
        *
        **
        ***
        ****
        *****
        ******




        for(int i = 0; i< 10;i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }



        //pattern
        1
        22
        333
        4444
        55555
        666666
        7777777

        for(int i = 0; i< 8;i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print(i);

            }
            System.out.println();
 }


        //break

        int i = 1;
        while(i < 10)
        {
           i++;
            System.out.println(i);
            if (i == 5)
            break;
        }
        System.out.println("Hello");


        //Skip 5

        int i = 1;
        while (i < 10)
        {
            if(i != 5)

            System.out.println(i);
            i ++;

        }


        //continue skip 5

        int i = 1;
        while(i < 10)
        {
            if (i ==5)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        //with for loop

        for(int i = 1; i <=10;i++)
        {
            if(i ==5)
            {
                continue;
            }
            System.out.println(i);
        }


        //pattern
        1
        12
        123
        1234
        12345
        123456
        1234567



        for(int i = 0; i< 8;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }




        import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


        int sum = a;
        int power = 1;

        for(int j = 0; j < n ;j++){
            sum = sum + power * b;

            System.out.print(sum + " ");

            power = power * 2;

        }

        System.out.println();
    }
}
}

// 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98

         */




















    }
}
