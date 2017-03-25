package srinivas.scannermethods.example1;

public class Sumofint {
	 public static void main( String args[] )
	   {
	      int sum;
	      int x;

	      x = 1;   // initialize x to 1 for counting
	      sum = 0; // initialize sum to 0 for totaling

	      while ( x <= 10 ) // while x is less than or equal to 10      
	      {
	         sum += x; // add x to sum
	         ++x; // increment x
	      } // end while

	      System.out.printf( "The sum is: %d\n", sum );
	   } // end main

	} // end class Calculate




