// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================      Java Ppractice 02     ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #

// // -------------------------- Topics --------------------------------// //
// // ------------------------------------------------------------------// //
// //                    1. Arithmetic/Assignment Operators                //
// //                    2. Unary Operators                                //
// //                    3. Math Class (random numbers)                    //
// //                    4. Input Function                                 //
// //                    5. Comparison Operator(Conditional)               //
// //                    6. Logical Operator                               //
// //                    7. Swith case                                     //
// // ------------------------------------------------------------------// //

import  java.util.Scanner;

public class App2
{
    public static void main(String[] args) 
    {
        // // -------------  1. Arithmetic/Assignment Operators   --------------

          double a =30;
          double b =14;
          double c = a%b;     // a +b,,,, a-b,,, a *b  ,,,, a%b,,, a/b
          System.out.println(a/b);





        // // -------------  2. Unary Operators   --------------
        int numb = 1;
        System.out.println(numb);
        System.out.println(numb++);    // post,,, will be added after running the line.
        System.out.println(++numb);
        System.out.println(--numb);
        System.out.println(numb--);
        System.out.println(numb);



        // // -------------  3. Math Class   --------------        
        System.out.println(Math.max(5,6));        // maximum function
        System.out.println(Math.min(5,6));        // minimum function
        System.out.println(Math.random());            // random function
        System.out.println((int)(Math.random()*100 + 7));       // random function in integer value (casting)






        // // -------------  4. Input Function   --------------    
        // ====================>>>>>>    import scanner 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int numb = sc.nextInt();    // float n = sc.nextFloat();
        System.out.println(numb);  

        System.out.println("Enter your name: ");
        //String name1 = sc.next();   // single input only one word
        String name = sc.nextLine();  // multi space input,,, large line,
        System.out.println(name);




        // // -------------  5. Comparison Operator   -------------- 
        // // -------------  Conditional Statement  -------------- 

        boolean isSunUp = false;

        if(isSunUp == true){
            System.out.println("day");
        }
        else{
            System.out.println("night");
        }



        if (!isSunUp) {
            System.out.println("it is night");
        }
        else{
            System.out.println("It is day");
        }





        //----------------- 6. Logical Operator  --------------------------//
        int a =20, b=40;

        if(a>10 && b<30)    // if(a>10 || b<50)   // if(a>10 && b<50)        
        {
            System.out.println("Well done");
        }
        else if (a<10 && b > 30)
        {
            System.out.println("Oh no");
        }
        else
        {
            System.out.println("\nInvalid");
        }


        //----------------- 7. Switch statement  --------------------------//
        System.out.println("Enter week day: ");
        int age =  sc.nextInt();

        switch(age)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Error");

        // }
    }
}
