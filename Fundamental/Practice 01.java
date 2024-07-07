// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================      Java Ppractice 01     ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topics -----------------------------// //
// // ---------------------------------------------------------------// //
// //                        1. Comments                                //
// //                        2. Printing                                //
// //                        3. Data Types                              //
// //                        4. String                                  //
// //                        5. Arrays                                  //
// //                        6. Casting                                 //
// //                        7. Constants                               //
// // ---------------------------------------------------------------// //


import java.util.Arrays;   // just for sorting arrays

public class App {
    /**
     * @param args
     */
    
    public static void main(String[] args) 
    {
        // ===================== >>>   Printing  <<< ====================== //

        // ----- sout and enter instead of writing System.out.println

        System.out.print("Bilal Ashiq!");      // without endline
        System.out.println("Bilal Ashiq!");    // with endline (ln)


        // // ==================== >>>  commenting  <<< ===================== //   
        // Single line comment

        /*
        Multi line comments
        */
        



        // // ===================== >>>  Data types  <<< ===================== //  
        byte age = 30;
        int a = 10;
        float b = 4.5F;
        long c = 123456L;
        boolean f = true;

        System.out.println(f);




        // ===================== >>>  String  <<< ======================== // 

        // // ------ you have to made a new string if you want to change any string 
        String name1 = "Bilal";
        String name2 = " Ashiq";

        // // ------ concatenate
        String name3 = name1 + name2;
        System.out.println(name3);  
        
        
        // //------charat
        System.out.println(name3.charAt(0));

        // // -----length
        System.out.println(name3.length());

        // // ---- replace
        String n = name3.replace('i', 'a');
        System.out.println(n);


        // // ---- substring
        String n = name3.substring(0,5);
        System.out.println(n);





        // ================ >>>  Arrays  <<< ================ // 

        // ------- 1D array
        int [] marks = new int [3];
        //boolean [] marks = new boolean [3];
        marks[0] = 80;
        marks[1] = 60;
        marks[2] = 90;
        int [] marks1 = {1,2,3,4,5,6};   // initialize

        System.out.println(marks[1]);  
        System.out.println(marks.length); 
        System.out.println(marks);
        
        System.out.print("Before sorting 1st element: ");
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.print("After sorting 1st element: ");
        System.out.println(marks[0]);


        // //------- 2D array
        int [][] array2D = {{1,2,3},{6,7,8},{4,5,0}};
        System.out.println(array2D[1][0]);





        // // ---- casting
        int var1 = 10;
        double var2 = var1 + 20;

        System.out.println(var2);

        // //   ----- error
        int var3 = 10;
        // int var4 = var3 + 20.3;   // error
        int var4 = var3 + (int)20.3;    // it is casting 

        System.out.println(var4);    // output is 30 not 30.3 



        // //   //   for making value constant,, no one can change it now. 
        final float PI = 3.14F;
        // PI = 9.8F;   // error  

    }
}
