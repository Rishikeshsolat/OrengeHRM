import java.util.*;
public class priimenumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		System.out.println("Enter a prime Numben"+number);
		
		for(int i=1;i<number;i++)
		{
			boolean	isprime = true;
			for(int j=2;j<i;j++)
			{
				if (i%j==0) 
				{
				isprime = false;
				break;
				}
				if(isprime)
				System.out.println(i+" ");
				break;
			}
		}
	}
}
			
