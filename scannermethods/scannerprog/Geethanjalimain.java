package srinivas.scannermethods.scannerprog;

	// Fig. 4.10: Geethanjalimain.java
	// Create GradeBook object and invoke its determineClassAverage method.

	public class Geethanjalimain
	{
	   public static void main( String args[] )
	   {
	      // create Geethanjali object myGeethanjali and 
	      // pass course name to constructor
		   Geethanjali myGeethanjali = new Geethanjali( 
	         "Introduction to Java Programming" );

		   myGeethanjali.displayMessage(); // display welcome message
		   myGeethanjali.determineClassAverage(); // find average of percentages
	   } // end main

	} // end class Geethanjalimain



