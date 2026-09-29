package com.JavaInOneVideo.Access_Modifier.Home_Protected;

public class Home {

    private String name ;

    protected String space;


    public Home (String  name , String space ){
        this.name = name;
        this.space = space;

    }

    public Home() {
    }

    public void haveSpace(){
        System.out.println(name + "Have space :" + space);

    }
    //protected
    public void changeSpace(String newSpace){  // we use protect because
        // only class which extends this class can access this method
        this.space = newSpace;

    }


}
