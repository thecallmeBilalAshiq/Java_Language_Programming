// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================            Oop-05          ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topics -----------------------------// //
// // ---------------------------------------------------------------// //
// //                                                                   //
// //                      1. Abstraction                               //
// // ---------------------------------------------------------------// //


/* 
    Abstration bss koi cheez ha,,, jo soch skty ham use ni kr skty,,,,    
    horse is an animalll,,, we can see, but what is an animall ?? abstraction  
*/

abstract class Animal{
    public String name;
    abstract void walk();   // now it must be implemented in every child class.
    Animal()
    {
        System.out.println("Animal Constructor called");
    }
    public void eat()
    {
        System.out.println("All animals eats");
    }
}

class Horse extends Animal{
    Horse()
    {
        System.out.println("Horse Constructor called");
    }
    public void walk()
    {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Herbivores extends Animal{
    Herbivores()
    {
        System.out.println("Herbivoures Constructor called");
    }
    public void walk()
    {
        System.out.println("The Herbivores walks ");
    }

    // -------------------- Constant --------------------
    final public void eat(String name)
    {
        this.name = name;
        System.out.println("The Herbivores only eats plants "+ name);
    }

}



public class Oop5
{
    public static void main(String[] args) 
    {
        
        Horse horse = new Horse();
        Herbivores herbivores = new Herbivores();

        horse.walk();
        horse.eat();

        herbivores.eat("Goat");

        /*  --------- Abstract cannot run
            Animal animal = new Animal();
            animal.walk(); 
        */

    }
}
