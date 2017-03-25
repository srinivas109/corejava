package srinivas.scannermethods.scannerprog;

	// Fig. 4.9: Geethanjali.java
	// Geethanjali class that solves class-average program using 
	// sentinel-controlled repetition.
	import java.util.Scanner; // program uses class Scanner

	public class Geethanjali 
	{
	   private String courseName; // name of course this Geethanjali represents

	   // constructor initializes courseName
	   public Geethanjali( String name )
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

	   // display a welcome message to the Geethanjali user
	   public void displayMessage()
	   {
	      // getCourseName gets the name of the course
	      System.out.printf( "Welcome to the Geethanjali institute for\n%s!\n\n", 
	         getCourseName() );
	   } // end method displayMessage

	   // determine the average of an arbitrary number of grades
	   public void determineClassAverage()
	   {
	      // create Scanner to obtain input from command window
	      Scanner input = new Scanner( System.in );

	      int total; // sum of grades
	      int gradeCounter; // number of grades entered
	      int passpercent; // passpercnt value
	      double average; // number with decimal point for average

	      // initialization phase
	      total = 0; // initialize total
	      gradeCounter = 0; // initialize loop counter
	      
	      // processing phase
	      // prompt for input and read percentage from user
	      System.out.print( "Enter passpercentage or -1 to quit: " ); 
	      passpercent = input.nextInt(); 

	      // loop until sentinel value read from user
	      while ( passpercent != -1 ) 
	      {
	         total = total + passpercent; // add percentage to total
	         gradeCounter = gradeCounter + 1; // increment counter

	         // prompt for input and read next percentage from user
	         System.out.print( "Enter percentage or -1 to quit: " ); 
	         passpercent = input.nextInt(); 
	      } // end while

	      // termination phase
	      // if user entered at least one percentage...
	      if ( gradeCounter != 0 ) 
	      {
	         // calculate average of all percentages entered
	         average = (double) total / gradeCounter;  

	         // display total and average (with two digits of precision)
	         System.out.printf( "\nTotal of the %d percentages entered is %d\n", 
	            gradeCounter, total );
	         System.out.printf( "Class average is %.2f\n", average ); 
	      } // end if
	      else // no percentage were entered, so output appropriate message
	         System.out.println( "No percentage were entered" ); 
	   } // end method determineClassAverage

	} // end class Geethanjali



