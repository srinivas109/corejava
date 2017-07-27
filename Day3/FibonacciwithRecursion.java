package Day3;

import java.util.Scanner;

public class FibonacciwithRecursion {
	static int f1=0,f2=1,f3;     
	  static void fibo(int n){     
	     if(n>0){     
	          f3 = f1 + f2;     
	          f1 = f2;     
	          f2 = f3;     
	          System.out.print(" "+f3);    
	          fibo(n-1);     
	      }     
	  }     
	 public static void main(String[] args) {  
	  Scanner src= new Scanner(System.in); 
	  System.out.println("Enter total number of element"); 
	  int x = src.nextInt(); 
	  System.out.print(f1 +" " +f2); 
	  fibo(x-2); 
	 } 
}
