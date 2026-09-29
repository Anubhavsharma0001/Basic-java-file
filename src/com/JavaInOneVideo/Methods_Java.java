package com.JavaInOneVideo;

public class Methods_Java {
    /*
}
    public void main(String[] args) {

         //accesModifier returnType methodName(parameters )

        /*int[] a = {1,23,44,33,663,24};
        int[] b = {443,45,3,53,3,5,6,7,889,6};

        int z =  sumOfArray(a); // a reference variable to print result
        System.out.println(z);
        int q =  sumOfArray(b);
        System.out.println(q);







        String Result = upperFun("AnUbhav");
        System.out.println(Result);
        System.out.println(sum(3,4));

        System.out.println(sum(2,3,4));


        }
        public int sumOfArray(int[] arr){       //Methods
             //void(nothing return) --> int

        int sum = 0 ;                // fix code as methods which we can use continuously to get result
        for(int i : arr)
        {
            sum= sum + i;

        }
        return sum;  //sout(sum);



    }


    private static String upperFun(String str)
    {
        return str.trim().toUpperCase();



    }


    //method overloading --> name same , return type same , but parameter is different
                       //Signature
    private static int sum(int a , int b ) // sum of 2 number made a methods and get result in main methods

    {

        return a+b;

    }
                       //Signature
    private static int sum(int a , int b , int c )
    {
        return a+b+c;

    }



    public static void main(String[] args )
    {
        int x = 10;
        System.out.println(multiplyBy10(3));
        System.out.println(x);

        String a = "anubhav";
        System.out.println(upper("ADdbbsdfbvd"));
        System.out.println(a);


    }
    public static int multiplyBy10(int x )
    {
        return x * 10;

    }
    public static String upper(String str)
    {
        return str.toUpperCase();

    }




   //Variable Number of Arguments (variable args)

   public static void main(String[] args)
   {
       System.out.println(sum(3,4,5,6,6,77));
   }
   public static int sum(int ... a)    // Multiple integers ,Can be treated as array
   {
       int sum = 0;
       for (int i : a)
       {
           sum += i;
       }
       return sum;
   }

     */

    //Prime Number

    public static void main(String[] args)
    {
        System.out.println(isPrimeNumber(13));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(22));
        System.out.println(isPrimeNumber(659547847));


    }
    public static  boolean isPrimeNumber(int x)
            // A prime number is a number which is divided by itself or one only
            // 13 --> 1,2,3,4,5,6,7,8,9,10,11,12,13
            // 13/ 2 --> it mean it will divide by only half of it, 13/2=6 (1,2,4,5,6)
    {
        int res = 0;

        for(int i = 1;i<x/2 ;i++)
        {
            if (x % i == 0)
            {
                res ++;
            }


        }

        return res == 1; // because we are seeing that it will have only one factor only 1 only
        // we can not including 13



    }





}
