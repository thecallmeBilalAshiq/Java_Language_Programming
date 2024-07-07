// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================      Java Ppractice 03     ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #

// // -------------------------- Topics --------------------------------// //
// // ------------------------------------------------------------------// //
// //                    1. Loops                                          //
// //                    2. Break and continue                             //
// //                    3. Exeptional Handling                            //
// // ------------------------------------------------------------------// //

import  java.util.Scanner;

public class App3
{
    public static void main(String[] args) 
    {
        // // ----------  Loops  --------------

        //same as the C++ language 
        
         // --- for loop
        for (int i=0;i<5;i++)
        {
            System.out.println("*");
        }

        
       //   --- while loop 
        int a = 1;
        while(a<6)
        {
            System.out.print(a);
            a++;
        }


        //  --- do while loop
        int b = -3;
        do
        {
            System.out.println(b);
            b++;
        }while(b<6);


        // ------ break and continue
        for (int i = 0; i < 10; i++) 
        {
            if (i == 4) 
            {
                System.out.println("Skipping number 4 using continue");
                continue; // Skip the current iteration when i is 4
            }

            if (i > 6) 
            {
                System.out.println("Breaking loop at number " + i);
                break; // Exit the loop completely when i is greater than 6
            }

            System.out.println(i);
        }




        // ----------------- Exeptional Handling -----------------------

        int [] marks = {10,20,30};

        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            System.out.println("\n\tExeption occured...!!!");
        }

        System.out.println("Hi hello I am after the exeption...!!!");

    }
}
