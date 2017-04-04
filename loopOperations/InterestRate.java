package srinivas.loopOperations;

public class InterestRate
{
	public static void main(String args[])
	{
		
		double amount;
		double principal=10000;
		double rate=0.15;
		
		System.out.printf("%s%20s\n", "year", "amount on deposit");
		
		for (int year=1; year<=5; year++)
		{
			amount=principal*Math.pow(1+rate,year);
			
			System.out.printf("%4d%,20.2f\n", year,amount);
		}
	}

}
