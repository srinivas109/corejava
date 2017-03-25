package srinivas.scannermethods.sampleprog1;
//Fig. 4.6: CentralLibrary.java
	// CentralLibrary class that solves class-average problem using 
	// counter-controlled repetition.
	import java.util.Scanner; // program uses class Scanner

public class CentralLibrary { 
	
	   private String bookName; // name of book this CentralLibrary represents

	   // constructor initializes courseName
	   public CentralLibrary( String name )
	   {
	      bookName = name; // initializes bookName
	   } // end constructor

	   // method to set the book name
	   public void setBookName( String name )
	   {
	      bookName = name; // store the course name
	   } // end method setbookName

	   // method to retrieve the book name
	   public String getBookName()
	   {
	      return bookName;
	   } // end method getbookName

	   // display a welcome message to the CentralLibrary user
	   public void displayMessage()
	   {
	      // getbookName gets the name of the course
	      System.out.printf( "Welcome to the central library for\n%s!\n\n", 
	         getBookName() );
	   } // end method displayMessage

	   // determine class average based on 10 grades entered by user
	   public void determineBooksAverage() 
	   {
	      // create Scanner to obtain input from command window
	      Scanner input = new Scanner( System.in );

	      int total; // sum of grades entered by user
	      int gradeCounter; // number of the grade to be entered next
	      int grade; // grade value entered by user
	      int average; // average of grades

	      // initialization phase
	      total = 0; // initialize total
	      gradeCounter = 1; // initialize loop counter
	   
	      // processing phase
	      while ( gradeCounter <= 10 ) // loop 10 times
	      {
	         System.out.print( "Enter grade: " ); // prompt 
	         grade = input.nextInt(); // read grade from user
	         total = total + grade; // add grade to total
	         gradeCounter = gradeCounter + 1; // increment counter by 1
	      } // end while
	   
	      // termination phase
	      average = total / 10; // integer division yields integer result

	      // display total and average of grades
	      System.out.printf( "\nTotal of all 10 grades is %d\n", total );
	      System.out.printf( "Books average is %d\n", average );
	   } // end method determineBooksAverage

	} // end class CentralLibrary



