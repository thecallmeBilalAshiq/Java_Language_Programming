// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================      Java Ppractice 04     ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #

// // -------------------------- Topics --------------------------------// //
// // ------------------------------------------------------------------// //
// //                     1. Methods and Functions                         //
// // ------------------------------------------------------------------// //

import  java.util.Scanner;

public class App4
{
    public static void print()
    {
        System.out.println("\n\t--- Muhammad Bilal Ashiq--- \n");
    }

    public static void Summation(int a, int b)
    {
        System.out.print("Sum: ");
        int sum = a + b;
        System.out.println(sum);
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();

        print();
        Summation(a,b);


    }
}
