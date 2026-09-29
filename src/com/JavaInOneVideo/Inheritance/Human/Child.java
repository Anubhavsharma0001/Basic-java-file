package com.JavaInOneVideo.Inheritance.Human;

public class Child extends Parent {

    public Child(){




        System.out.println("Child constructor Called");
    }

    public void childMethod(){
        super.parentMethod(); // we can put under sout as it is not a constructor
        System.out.println("Child Method Called ");
    }


   public  static void main(String [] args ) {

        Child child = new Child();




    }
}
