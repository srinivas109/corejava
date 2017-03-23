package sayem.sim_prog1.methos4;

// Fig. 3.10: Coursedetails.java
// Coursedetails class with a constructor to initialize the course name.

public class Coursedetails
{
   private String courseName; // course name for this Coursedetails

   // constructor initializes courseName with String supplied as argument
   public Coursedetails( String name )
   {
      courseName = name; // initializes courseName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // display a welcome message to the Coursedetails user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this Coursedetails represents
      System.out.printf( "Welcome to the Coursedetails for\n%s!\n", 
         getCourseName() );
   } // end method displayMessage

} // end class Coursedetails



