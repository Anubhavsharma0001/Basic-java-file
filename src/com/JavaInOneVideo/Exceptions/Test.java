package com.JavaInOneVideo.Exceptions;

/*


There are three types of error
1)Syntax Error -- Wrong syntax
2)Logical Error (Logic as error (Multiply <--> Divide ))
3)Runtime Error (During running of code ,error will come )


 */

public class Test {

    //public static void main(String[] args) {
        /*
        int[] numerators = {10, 20, 30, 40,};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            }catch (Exception e){
                System.out.println(e);

            }
            }


        System.out.println("Good Job");

    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            System.out.println(e); // what error  coming
            return 0;
        }
    }
}
    /* There will be a error that anything divide by 0 will be infinty
    // Java doesnot know that divide by zero is infinty so it shows exception
    // Runtime error

    // exception handling is way to handle the runtime errors so that normal flow of the application can be maintained .
    //Exception is an event that disrupts the normal flow of the program .
    //It is an object which is thrown at runtime .
    No two exception will come in one try block , they will react differently


     1)ArithmeticException e
     2) RuntimeException e
     3) NullPointerException e
     4)IndexOutOfBoundException
     4) Exception e (Largest in hierarchy)

     // arithmetic exception is subclass of runtime exception.



    Syntax ;

    try {
      Statement in which error can be occour

    }catch(){
       Statement that we want to be there for recovery ;

       // Stack trace is a detail information about exception and what type of exception is there .
           detail info about methods calls that leads to exception.
           Snapshot of call stack.
           Syntax :
           StackTraceElement [] stackTrace = o.getStackTrace();


           //Checked and Unchecked exception:
           there are some exception which are not checked from compilers .
           Example:
           1)Null pointers
           2) Arithmetic exceptions
           3) Index Out of bound

         There are some exception which are checked during compile time that are called checked exceptions .

        try {
            level1();

        }catch(Exception o){

            o.printStackTrace();

            /*
            OR


            StackTraceElement[] stackTrace = o.getStackTrace();
            for (int i = 0 ;i < stackTrace.length;i++){
                System.out.println(stackTrace[i]);
            }



        }



    }
    public static void level3() {


        int[] array = new int[5];
        array[5] = 10;  //this is exception which is propagate to next and next level .

    }

    public static void level2(){

        level3();

    }
    public static void level1(){
        level2();

    }

    Exception of file reader :
       File Exception is under IO Exception .


        try{
            FileReader fileReader = new FileReader("a.txt ");

        }catch(IOException e)
        {
            System.out.println(e);

        }
    }

   OR
we call try catch to handle exception or we call the caller (throws Exception )





    public static void main(String[] args) throws Exception//  OR Exception
    {
        method2();
        System.out.println("Hello");

    }
    public static void method2() throws Exception{ //method signature
        method1();
    }
    public static void method1()throws Exception {
        FileReader fileReader = new FileReader("a.txt");

    }


    Throw Exception keyword:Forcefully to handle exception , we can use throw
    throw new (unchecked Exception) ArithmeticException();




    public static void main(String[] args) throws Exception{

        method2();
    }
    public static void method2() throws Exception{
        method1();


    }
    public static void method1() throws Exception{

        FileReader fileReader = new FileReader("a.txt");
        throw new FileNotFoundException("OOPS");    //throw exception handler

    }
    Finally Keyword: This keyword will run even after try catch will not run.
     It is used to print statement even after any exception is going on .


   public static void main(String[] args) throws Exception{

       System.out.println(divide(1,0));

    }

    public static int divide (int a , int b){
       try{
           return a/b;


       }catch (Exception e){

           return 0;

       }
       finally {
           System.out.println("Hello Namaste ");
       }

    }

}

to handle these resources like buffer reader and all
java introduced TRY WITH RESOURCES JAVA 7
         */
}




