package srinivas.loopOperations;

public class SumOfEvenInt
{
	public static void main(String args[])
	{
		int total=0;
		
		for (int number=2; number<=30; number=number+2)
			total=total+number;
		
		System.out.printf("Sum is %d\n",total);
		
	}

}
