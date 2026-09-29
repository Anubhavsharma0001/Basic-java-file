package com.JavaInOneVideo.Inheritance.Human;

public class Grand_Parent {

    private String name;

    private int age;

    public boolean isHasSuperPowers() {
        return hasSuperPowers;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    public Grand_Parent(){


        hasSuperPowers = true;

        System.out.println("GrandParent constructor Called");
    }





    private boolean hasSuperPowers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public static void main(String[] args ) {

        /*Multilevel Inheritance :
         Grandparent
            |
         Parent
            |
         Child
         */





    }
}
