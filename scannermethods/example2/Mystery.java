package srinivas.scannermethods.example2;

public class Mystery 
{
   public static void main( String args[] )
   {
      int y;
      int x = 1;
      int total = 0;

      while ( x <= 10 ) 
      {
         y = x * x;
         System.out.println( y );
         total += y;
         ++x;
      } // end while

      System.out.printf( "Total is %d\n", total );
   } // end main

} // end class Mystery



