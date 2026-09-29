package com.JavaInOneVideo.Access_Modifier.Home_Protected;



public class Room extends Home {

    public Room (String name){
        super(name , "Square ");
    }

    public void cupBoard(){
        System.out.println(getName() + "It has cupBoard");
    }

    private String getName() {
        return getClass().getSimpleName(); //it provide name of class

    }

    public void setRoomSpace(String newSpace){   // we are calling changespace method
        changeSpace(newSpace);
    }
}
