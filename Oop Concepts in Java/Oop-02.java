// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================            Oop-02          ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topics -----------------------------// //
// // ---------------------------------------------------------------// //
// //                    1. Polymorphism                                //
// //                    2. Function Overloading                        //
// // ---------------------------------------------------------------// //

/// import  java.util.Scanner;

class Student{
    String name;
    int roll;

    Student ()
    {
    }


    //  // ------------  3 functions with same name,,, function overloading
    public void printInfo(String name)
    {
        System.out.println("Name: "+ name);
    }

    public void printInfo(int roll)
    {
        System.out.println("Roll: "+ roll);
    }


    public void printInfo(String name, int roll)
    {
        System.out.println("Name: "+ name);
        System.out.println("Roll: "+ roll);
    }


}

public class Oop2
{
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       s1.name = "Muhammad Bilal Ashiq";
       s1.roll = 1234;

       //s1.printInfo(s1.name);
       //s1.printInfo(s1.roll);
       s1.printInfo(s1.name, s1.roll);

    }
}
