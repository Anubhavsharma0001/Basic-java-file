package com.JavaInOneVideo;

public class String_Methods {
    public static void main(String[] args ) {


        /*
        String name = "ANUBHAV SHARMA";

        int length = name.length(); // to check length
        char c = name.charAt(0); // charAt() give me the character at that position
        // range of charAt() --> 0 to length-1
        System.out.println(c);





        // to check equality of string ,
        we used name.equals

        String name = "ANUBHAV";
        String name2 = "Anubhav";
        System.out.println(name.equals(name2)); // to check every string is equal or not
        System.out.println(name.equalsIgnoreCase(name2)); // to check string with ignoring case of string



        // ctrl + shift + U = Upper case
        //.compareTo

        String str1 = "REMOTE";
        String str2 = "remota";
        System.out.println('e'+ 0);// ASCII value of r
        System.out.println('a' + 0); // ASCII value of c
        int i = str2.compareTo(str1); //compare ASCII of where character start different


        System.out.println(i);



        //compareToIgnoreCase = ignore the case and compare the character to character and then susbtract the ASCII

        String str1 = "REMOTE";
        String str2 = "remota";
        System.out.println('e'+ 0);// ASCII value of r
        System.out.println('a' + 0); // ASCII value of c
        int i = str2.compareToIgnoreCase(str1);
        System.out.println(i);




        //substring

        String name = "Anubhav";
        String substring = name.substring(4,6); // it is used to print character from where i want
        System.out.println(substring);


        //part of substring

        String name = "Anubhav";
        String substring = name.substring(4,6); // it is used to print character from 4 to 5 only exclude last
        System.out.println(substring);

         // String are immutable

        1)name.toUpperCase();
        2)name.toLowerCase();
        3)name.trim();  //used to remove space
        4)name.replace("panchal","Sharma")
        5)name.contains("sha")'
        6)name.startsWith("An");
        7)name.endsWith("ma");
        8)str.isEmpty();
        9)Str.isBlank();
        10)name.charAt();
        11)name.indexOf();
        12)name.lastIndexOf();

        Methods which return same =
        name.substring(2,4);   && name.subSequence(2,4);




         */
        int a = 10; // number is converted into string
        String s = String.valueOf(a);
        System.out.println(s);


    }
}
