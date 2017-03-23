package sayem.sim_prog1.method2;

// Fig. 3.5: GradeBookTest.java
// Create GradeBook object and pass a String to 
// its displayMessage method.
import java.util.Scanner; // program uses Scanner

public class Coursedetailsmain
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      // create a GradeBook object and assign it to myGradeBook
      Coursedetails myCoursedetails = new Coursedetails(); 

      // prompt for and input course name
      System.out.println( "Please enter the course name:" );
      String courseName = input.nextLine(); // read a line of text
      System.out.println(); // outputs a blank line

      // call myGradeBook's displayMessage method 
      // and pass courseName as an argument
      myCoursedetails.displayMessage( courseName );
   } // end main

} // end class GradeBookTest

