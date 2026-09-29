package com.JavaInOneVideo.final_keyword;

public abstract class Device {



    public final int sellingPrice = 1000;  // we cannot put setter here if final keyword is used

    public int getSellingPrice() {
        return sellingPrice;
    }

    //with static keyword we can use final keyword

    public static final int buyPrice;   // we didn't set price so we can set it inside static block

    static{
        buyPrice = 2000;

    }

    // with constructor

    private final int processorPrice ;

    public Device (){
        processorPrice = 1200;
    }



    public String company_name;

    public String getCompany_name() {
        return company_name;
    }



    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public  int year;

    public abstract String validYear();

    public abstract String Authentic();


}
