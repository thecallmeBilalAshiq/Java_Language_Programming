// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================      Java Ppractice 05     ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #

// // -------------------------- Topics --------------------------------// //
// // ------------------------------------------------------------------// //
// //                            File Handling                          // //
// // ------------------------------------------------------------------// //

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Scanner;

public class App5
{
    public static void main(String[] args) 
    {
        // // ------------------- create the file
        File file = new File("newFile.txt");
        try {
            file.createNewFile();
        } catch (IOException exp) {
            System.out.println("\noh..!!!! Unable to create the file...!!! ");
            exp.printStackTrace();
        }

        // // ------------------- write in the file
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("newFile.txt");
            fileWriter.write("This is file named 'newFile.txt' \nHello! Mr. Bilal AShiq \nRecite Darood Pak");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // // ------------------- Read the file
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // // ------------------- Delete the file

        try {
            file.delete();
            System.out.println("File ("+ file + ") has been deleted");
        } catch (Exception e) {
            System.out.println("Error occured, file not deleted.");
            // TODO: handle exception
        }


    }
}
