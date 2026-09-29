package com.JavaInOneVideo.Enums;

public class Enums_basic   {
    //Enumeration -- Listing of things
    // we use switch case her with enums as printing some specific for an event
    public static void main(String[] args) {

       /* System.out.println(Day_class.MONDAY);
        System.out.println(Day_class.TUESDAY);
        System.out.println(Day_class.WEDNESDAY);
        System.out.println(Day_class.THURSDAY);
        System.out.println(Day_class.FRIDAY);
        System.out.println(Day_class.SATURDAY);
        System.out.println(Day_class.SUNDAY);

        Another with enums

        System.out.println(Day.MONDAY);
        System.out.println(Day.SUNDAY);


        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal();
        System.out.println(ordinal); // Give index of monday in list

        Day saturday = Day.SATURDAY;
        int ordinal1 = saturday.ordinal();
        System.out.println(ordinal1);

        // String changes to enums

        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);


        //It will print all days
        for (Day value : Day.values()) {
            System.out.println(value);

        }

        //We can run method too


        Day monday = Day.MONDAY;
        monday.display();

        */
        Day day = Day.WEDNESDAY;

        String res  = switch (day){
            case MONDAY -> "M";
            case TUESDAY -> "T";
            case WEDNESDAY -> "W";
            case THURSDAY -> "T";
            case FRIDAY -> "F";
            case SATURDAY -> "S";

            default -> "Weekend";

        };
        System.out.println(res);


    }

}
