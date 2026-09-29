package com.JavaInOneVideo;

public class String_Data_Type {
    public static void main(String[] args  ) {
        /*
        String store  many characters at once(Sequence of character )
        It is a class not primitive data type


        char a = 'a';
        System.out.println(a);
        String b = "ANUBHAV SHARMA";
        System.out.println(b);




        int a =1 ; //
           Student student = new Student(); //new object allocate memory at HEAP
              // Refernce variable will store address
           student.name = "Anubhav";
           student.address = "India ";
           student.Roll_number = 10;
        System.out.println(student.name);



        String a = new String("RAM");
        String b = new String ("RAM");
        System.out.println(a == b); // Because this is new memory allocated variable(2 Different location)

        //new create a new heap memory

        String c = "RAM";
        String d = "RAM";
        System.out.println( c == d); //same string but not used different memeory --> it will dump it in string pool

         */
        String x = "RAM";
        String a = new String("RAM");
        String b = new String(x);
        String c = "RAM";
        String d = "RAM";
        System.out.println(a == b); // == is used to check reference of string
        System.out.println(c == d);





    }
}
