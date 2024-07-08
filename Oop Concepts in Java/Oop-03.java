// =================================================================================================== #
// ==================================                            ===================================== #
// ==================================            Oop-03          ===================================== #
// ==================================     Muhammad Bilal Ashiq   ===================================== #
// ==================================                            ===================================== #
// =================================================================================================== #


// // -------------------------- Topics -----------------------------// //
// // ---------------------------------------------------------------// //
// //                         Inheritance                               //
// //                      1. Single Level Inheritance                  //
// //                      2. Mulit Level Inheritance                   //
// //                      3. Hierechy Inheritance                      //
// //                      4. Hybrid Inheritance                        //
// // ---------------------------------------------------------------// //

class Shape{
    int length;
    int width;
    public void area()
    {
        System.out.println("Display Area... ");
    }
}

class Triangle extends Shape{   // single level if only one
    public void area(int length, int width)
    {
        System.out.println(1/2*length*width);
    }
}

class EquiletralTriangle extends Triangle{   // now it is multi level if shape --- triangle --- equiletral
    public void Area()
    {
        System.out.println("Multi level now");
    }
}

class Circle extends Shape    // shape -----> triangle,,,,,,,,,      shape ----> cirlce   ,,,m and overall it is hybrid now
{
    syste.out.println("Hierechy ..... ");
}

public class Oop3
{
    public static void main(String[] args) 
    {
        //Triangle t1 = new Triangle();
        // // t1.name = "Bilal";    // even if Triangle class hs no variable name but it can still access
        // t1.length=8;
        // t1.width=10;
        // t1.area(t1.length,t1.width);

        EquiletralTriangle eqt = new EquiletralTriangle();
        eqt.Area();
    }
}


/*
            ===============================================================================
            ==============================              ===================================
            =========================== >>  Explanation << ================================
            ==============================              ===================================
            ===============================================================================
        
          
  ===================== >>>>  1. Single Level Inheritance <<< ===================

                                -----------------
                                |    SHAPE      |
                                -----------------
                                        |
                                        |
                                        V
                                -----------------
                                |    Triangle   |
                                -----------------



  ===================== >>>>  Multi Level Inheritance<< ===================

                          ------------------------
                          |        SHAPE         |
                          ------------------------
                                  |
                                  |
                                  V
                          ------------------------
                          |      Triangle        |
                          ------------------------
                                  |
                                  |
                                  V
                          ------------------------
                          | Equiletraal Triangle |
                          ------------------------



  ===================== >>>>  Hierechy Inheritance <<< ===================

                              -----------------
                              |    SHAPE      |
                              -----------------
                           ++                  ++
                          ++                     ++
                         ++                       ++
          -----------------                        -----------------
          |    Triangle   |                        |     Circle    |
          -----------------                        -----------------






  ===================== >>>>  Hybrid Inheritance <<< ===================

                                        -----------------
                                        |    SHAPE      |
                                        -----------------
                                    ++                  ++
                                   ++                     ++
                                ++                          ++
                    -----------------                        -----------------
                    |    Triangle   |                        |     Circle    |
                    -----------------                        -----------------
                            |
                            |
                            V                                                        
                ------------------------
                | Equiletraal Triangle |
                ------------------------

 */
