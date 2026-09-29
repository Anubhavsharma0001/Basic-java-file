package com.JavaInOneVideo.Memory_management;

public class Memory {



    /*
    JVM uses memory for
    1) Memory allocation
    2) Memory use or update
    3)Memory de-Allocate

    > Java has a special feature of manual memory management , like we java has automatic garbage collection
    as if anything is unuse or not inn use will be free automatically

    //Disadvantage of less memory optimise code

    > memory leakage
    > performance get degraded
    > Out of memory Error / Stack out of low error == it will be there when memory is full.

 /memory is divided into small chunks which have their own responsibility :

    There are two types of  memory:
    /THREAD SPECIFIC

    >Every thread have their own thread stack or programme counter

   1) STACK
   2) PROGRAMME COUNTER OR REGISTER

   /THREAD SHARE MEMORY
   But every thread will have their same heap and same method area

   3) METHOD AREA
   4) HEAP

   Both are created by JVM and stored in RAM.


   STACK MEMORY:
   >Store temporary variables (int a ) and separate memory blocks for methods.
   >Store Primitive data types
   >Store Reference of heap objects
     -Strong reference
     -Weak reference
       -Soft reference
   > Each thread has its own stack memory
   > LIFO
   > Store Current method
   > Execution memory
   > It store stack frames
   > Parameter
   > Return address
   > It grows and shrink automatically ,
   memory is automatically clean.
   > push and pop method in stack runs in constant time
   > Variable comes from parameter call local variable stores here .

    Stack Overflow Error : It occurs when stack become full.
    > A common case is recursion without base case .

   PROGRAMME COUNTER :
   > It store current instruction which is now executing .


   HEAP MEMORY:
   > Store new objects
   > Instance variable
   > Arrays
   > String pool if is it literal
   > String in heap if new keyword is used
   > It is huge chunk of memory in respect to all other memory
   > Garbage collection works on this memory.
   > String pool
   > Variable which is under object called instance variable

   /Properties

   > Shared across thread
   > Dynamic in nature (-Xms 2m (Minimum space) , -Xmx 4m (Maximum space) )
   > Out of memory error will come if space is full in heap memory if once we defined
   > Manage by GC
   > Usually slower than stack




   METHOD AREA:
   > It store class level blueprint  or metadata
   it mean it will store class name , inherit  , interface implement
   > Whenever JVM interact with class , it loads class meta data into method area
   > All static variable goes in method area , which are written under object but not consider under object , they are class specific
   > Store method signature .

   Types of references:   // They are in decreasing order of strictness of GC ,
   1) Strong reference   // We mostly use this reference
   2) Soft Reference
   3) Weak reference
   4) Phantom reference

   STRONG REFERENCE :
   > Whenever we create a reference as STUDENT S1 = new STUDENT();
   > it say to Gc that don't remove this variable until i'm pointing this variable


   >>SOFT REFERENCE :
   > Syntax:
   soft reference <Student> s2 = new Soft reference<>();
   s2.get();  // we'll get object if there is object ..... if not NULL
    > It tells GC to have this variable until ,  you don't need any memory need
    > Cache is a example of soft reference

    >> WEAK REFERENCE:
     Syntax : weak reference <Student> s3 = new weak reference <>();
     > It tell GC that have this variable until next GC runs
     > Weak hash map ......example


     >>PHANTOM REFERENCE:
     > It will never eve store reference
     > when we will run .get() command we will always get NULL
     > GC indicate that variable which it is about to remove , so it will give to phantom reference.




     GARBAGE COLLECTION:
     There are mainly 3 algorithm :
     1) MARK AND SWEEP
     2) MARK AND COMPACT
     3) COPYING

     >>>MARK AND SWEEP:
     > It is the most basic algo
     > if there are too many obj in a heap memory
     > first it mark the variable , then sweep;
     > It goes obj by obj , and see which obj are not marked or pointed byu anyone
     > It runs in major GC (Old generation)
     > It leaves gap or memory in between unreachable vs reachable
     > Fragmented space


     >>> MARK AND COMPACT (More optimised algo than above)
     > It mark the unreachable and reachable obj
     > It also remove the vacant space of unreachable obj , it left shift or right shift the obj
     > NO fragmented space
     >  It has a disadv of moving memory is little bit costly operation
     > It is also run in major GC




     >>> COPYING (ONLY FOR YOUNG GENERATION OR MINOR GC )
     > It copies the reachable obj to next step


     >> Garbage collection-- STW (IT STOP THE WORLD)
     > Whenever garbage collection runs it stops the application
     > The programme will slow bcz it will stop execution
     > It is a costly operation

     >> MODERN JAVA
     > We now use parallel GC
     > Earlier we use sequential GC
     > Where parallel GC uses multiple thread for running , also sequential uses single thread
     > Bcz of parallel GC it stops for negligible time .

     >> COMMAND for GC runs :
         System.gc();  // It only request JVM to run GC
         But it all depends on JVM

         > when out of memory error will come when memory is leaked
         > HEAP DUMP : It is screenshot or snapshot of current heap , and tell which obj is interacting to which obj.
         > Visual VM is a example  .












    */
}
