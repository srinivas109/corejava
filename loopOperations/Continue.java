package srinivas.loopOperations;

public class Continue 
{
	public static void main(String args[])
	{
		int count;
		for(count=1;count<=10;count++)
		{
			if(count==6)
			continue;
			System.out.printf("%d ", count);
		}
		System.out.printf("\n skip the value=6");
	}

}
