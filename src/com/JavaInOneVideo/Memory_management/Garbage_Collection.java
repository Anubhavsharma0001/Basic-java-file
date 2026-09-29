package com.JavaInOneVideo.Memory_management;

public class Garbage_Collection {

    /*
    HEAP MEMORY:
    > Objects
    > String with new keyword
    > String with literal goes to string pool
    > Array
    > GC clean it

    It is mainly divided into 2 parts :
    1) Young generation (Minor GC)
    2) Old generation (Major GC)
    3) String pool


    YOUNG GENERATION:
    This is further divided into 3 parts :
    1) EDEN
    2) Rest of two arw : SURVIVOR SPACE(S0 , S1)


    > Whenever we make a new object using new keyword it will go to EDEN type of heap memory
    > Inn heap memory , every object start with young generation and specially with edem
    > EDEN allocation is very fast .
    > In young generation GC will faster runs but in older generation will be runs slowly or for less .

    > About object , object when initialised it goes to EDEN .
    > Older means times of GC runs and it is still pointing something .
    > if once it runs (GC ) , then it remain undead , it will go to S0.....If it get more older then it goes to S1
    > Likewise if we allotted that it will be 15 times older and undead then it will goes to older generation.
    >
    >

    JAVA Optimization :
    1) Survivor space overflow as it more object from survivor space to old generation.
    2) Dynamic age determination.(bunch of object moved to older generation)
    3) Large objects
     */
}
