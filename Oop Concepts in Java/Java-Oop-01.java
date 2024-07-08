// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================            Oop-01          ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topics -----------------------------// //
// // ---------------------------------------------------------------// //
// //               1. Classes                                          //
// //               2. Constructors(Default, parametrized,copy)         //
// // ---------------------------------------------------------------// //

class Student{
    String name;
    String roll;

    void print()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }


    // // ------------ default constructor
    Student ()
    {
        System.out.println("Constructor is called ");
    }


    // // ------------ default constructor
    Student (String name, String roll)
    {
        this.name = name;
        this.roll = roll;
    }
    
    
    // // ------------ Copy constructor
    Student(Student s2)
    {
        this.name = s2.name;
        this.roll = s2.roll;
    }

    // // ------------ Destructor
    // // Unlike C++,,,,, In Java we do not have to make destructors, it is good thing in java
    // // In java autoatically destructor called (GARBAGE)

}

public class Oop1
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Bilal Ashiq", "123456");    
        // s1.name = "Bilal Ashiq";
        // s1.roll = "12345";

        Student s2 = new Student(s1);    // copying object 1 to the object 2 
        s2.print();

    }
}
