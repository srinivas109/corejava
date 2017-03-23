package sayem.sim_prog1.method3;

// Fig. 3.8: GradeBookTest.java
// Create and manipulate a GradeBook object.
import java.util.Scanner; // program uses Scanner

public class Coursedetailsmain
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      // create a coursedetail object and assign it to myGradeBook
      Coursedetails myCoursedetails = new  Coursedetails(); 

      // display initial value of courseName
      System.out.printf( "Initial course name is: %s\n\n",
         myCoursedetails.getCourseName() );

      // prompt for and read course name
      System.out.println( "Please enter the course name:" );
      String theName = input.nextLine(); // read a line of text
      myCoursedetails.setCourseName( theName ); // set the course name
      System.out.println(); // outputs a blank line

      // display welcome message after specifying course name
      myCoursedetails.displayMessage();
   } // end main

} // end class GradeBookTest


