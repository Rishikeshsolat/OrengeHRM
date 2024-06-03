package OppsPractice;

import java.util.Scanner;

public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		
		int  originalnum,digit, cubesum =0,num;
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		originalnum =num;
		
		while (num != 0 )
		{
			digit = num%10;
			cubesum += Math.pow(digit, 3);
			num /= 10;
		}
		
		if (cubesum == originalnum)
			System.out.println(originalnum + " is an Armstrong number");
		else 
			System.out.println(originalnum +" is not Armstrong number");
			
	
	}
}
