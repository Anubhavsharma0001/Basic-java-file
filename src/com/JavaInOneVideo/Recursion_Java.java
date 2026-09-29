package com.JavaInOneVideo;

public class Recursion_Java {
    /*
    public static void main(String[] args )  {

        //Factorial --> 6 = 6*5*4*3*2*1

        System.out.println(factorial(5));

    }

    public static int factorial(int n )
    {
        int fact = 1;


        for(int i = 1;i<=n;i++)
        {
            fact = i * fact;

        }
        return fact;
    }


    //recursion --> A method which call itself

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n ) {
        if ( n == 1)
        {
            return 1;

        }
        return n * factorial(n - 1); // Recursion



        /*factorial(5) calls factorial(4)
        factorial(4) calls factorial(3)
        factorial(3) calls factorial(2)
        factorial(2) calls factorial(1)
        factorial(1) calls factorial(0)
                factorial(0) returns 1 (Base case reached)

        factorial(1) return 1*1=1
        factorial(2) return 2*1=2
        factorial(3) return 3*2=6
        factorial(4) return 4*6=24
        factorial(5) return 5*24=120

        //Call Stack(LIFO last in first out )

    }

     */
    //Sum of n natural number
    // 5 + 4+3+2+1  --> 5+ sumofNaturalNumber(4)


    public static void main(String[] args )
    {
        System.out.println(sumOfNaturalNumber(565));

    }

    public static int sumOfNaturalNumber(int n )
    {
        if (n == 1)
        {
            return  1;
        }
        return n + sumOfNaturalNumber(n - 1);



    }
}
