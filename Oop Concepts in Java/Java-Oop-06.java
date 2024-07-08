// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================            Oop-06          ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topic  -----------------------------// //
// // ---------------------------------------------------------------// //
// //                                                                   //
// //                         Interface                                 //
// // ---------------------------------------------------------------// //


/* 
    Abstration bss koi cheez ha,,, jo soch skty ham use ni kr skty,,,,    
    horse is an animalll,,, we can see, but what is an animall ?? abstraction  
*/

interface Animal{

    void walk();  // by default public and abstract       
    // must be implemented in child classes
    // ----------- static, final, and public everything in interface


    /*void walk() {}   // not possible 
    */
    // Animal(){}     // constructor can not be created in interface

}


interface Herbivores
{

}

class Horse implements Animal,Herbivores {
    public void walk()
    {
        System.out.println("Horse walks on  4 legs");
    }
}

public class Oop6
{
    public static void main(String[] args) 
    {
        Horse horse = new Horse();
        horse.walk();
    }
}
