package com.JavaInOneVideo;

class Test {
    static void main() {

          /*
          primitive data type
           1)whole number
           byte = smallest value
           short = larger than byte
           int  = Middle
           long (l) = Largest value

          2)Decimal number
           float (f) - less precise (7 decimal digit)
           double -more precise (15 decimal digit)

          3)Boolean
           True or false

          4)Character
           char-single value (close with single inverted commas)
           string - can store multiple values

           Type Casting - changing char to int or int to char
                ** Compactible **
            Implicit or wideing conversion - putting smaller data type to  larger data type
            Narrowing conversion - putting larger data type into smaller data type by mentioning it (int)





        int age = 155;
        byte
        short
        int
        long

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);


           */

        /*

        float mysalary1 = Float.MIN_VALUE;
        float mysalary2 = Float.MAX_VALUE;

        double mysalary3 = Double.MIN_VALUE;

        double mysalary = Double.MIN_VALUE;

        System.out.println(mysalary1);
        System.out.println(mysalary2);
        System.out.println(mysalary3);
        System.out.println(mysalary);

         */

        //charater
/*
        char anubhav = 'b';
      //Type casting
        System.out.println((int) anubhav);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((char)10084);
        char hindichar = 2315;
        System.out.println(hindichar);
        char rightsymbol = '\u2303';


         for( int i = 0; i < 128; i++)
        {
            System.out.println((char)i);

            Example of wideing and narrowing:

               // wideing conversion or automatic or implicit conversion

          int a = 10; // 4 byte
            long b = a; // long(8 bytes) size is big enoungh that it can put integer inside it .
            float c = a; // 4 bytes
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

            float f = 1.7f;
       //Type cast
        int g = (int)f; //possible lossy conversion from float to int, (after mentioning int it will show integer )
        System.out.println(g);


        byte byteValue = 10; //1 byte (8 bits )
        short shortValue = byteValue; // (2 byte )Widening conversion from byte to short
      int intValue = shortValue; // Widening conversion from short to int
      long longValue = intValue; // Widening conversion from int to long
        float floatValue = longValue; // Widening conversion from long to float
        double doubleValue = floatValue; //Widening conversion from float to double

        System.out.println("Byte :" + byteValue);
        System.out.println("Short : " + shortValue);
        System.out.println("int: "+ intValue);
        System.out.println("long : " + longValue);
        System.out.println("float :" + floatValue);
        System.out.println("double :" + doubleValue);



        // char to int
        char charValue = 'A';
        int intValueChar = charValue; // Widening Conversion from char to int

        System.out.println("char :" + charValue);
        System.out.println("int :" + intValueChar);



        // char to float
        char charValue = 'A';
        float floatValueChar = charValue; // Widening Conversion from char to int

        System.out.println("char :" + charValue);
        System.out.println("float :" + floatValueChar);


         // Narrowing- possible lossy conversion

        double doubleValue = 123.456;
        float floatValue = (float) doubleValue; // Narrowing conversion from double to float
        long longValue = (long) floatValue; // Narrowing conversion from float to long
        int intValue = (int) longValue ; // Narrowing Conversion from long to int

        System.out.println("double :" + doubleValue);
        System.out.println("Float  : " + floatValue);
        System.out.println("Long :" + longValue);
        System.out.println("int :" + intValue );

 */
        //System.out.println(Integer.toBinaryString(23232)); // to print binary of such number


        }







    }


