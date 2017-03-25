package srinivas.scannermethods.sampleprog1;
//Fig. 4.7: CentralLibraryTest.java
//Create CentralLibrary object and invoke its classAverage method.

public class CentralLibraryTest
{
	public static void main( String args[] )
	   {
	      // create CentralLibrary object inCentralLibrary and 
	      // pass book name to constructor
		CentralLibrary inCentralLibrary = new CentralLibrary( 
	         " Java Programming Books" );

		inCentralLibrary.displayMessage(); // display welcome message
		inCentralLibrary.determineBooksAverage(); // find average of 10 grades
	   } // end main

	} // end class CentralLibraryTest



