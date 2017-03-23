package sayem.sim_prog1.methos4;

// Fig. 3.11: Coursedetailsmain.java
// Coursedetails constructor used to specify the course name at the 
// time each Coursedetails object is created.

public class Coursedetailsmain
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create Coursedetails object
      Coursedetails myCoursedetails = new Coursedetails( 
         "CS101 Introduction to Java Programming" ); 
      Coursedetails myCoursedetails1 = new Coursedetails( 
         "CS102 Data Structures in Java" );

      // display initial value of courseName for each Coursedetails
      System.out.printf( "myCoursedetails course name is: %s\n",
         myCoursedetails.getCourseName() );
      System.out.printf( "myCoursedetails1 course name is: %s\n",
         myCoursedetails1.getCourseName() );
   } // end main

} // end class Coursedetailsmain



