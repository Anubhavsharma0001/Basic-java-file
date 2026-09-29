package com.JavaInOneVideo.Abstraction;

public abstract class Vehical {

    private String Company_name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }

    private int year;

    public abstract void accelerate();

    public abstract void deaccelerate();



    public abstract void  tyre(); // if we remove this public then we can access only within package

    protected Vehical (){
        System.out.println("Must have valid RC");
    }
    /*

    we used abstract instad of using this whole wriiten down , and it's body will be define in child class


    public  void  tyre(){
        System.out.println("...");
    }

    public Vehical() {
        System.out.println("VEHICAL HAS TYRE");


    }

     */



}
