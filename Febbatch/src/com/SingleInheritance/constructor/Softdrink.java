package com.SingleInheritance.constructor;
import java.util.Scanner;
public class Softdrink	extends SingleInheritance
{	String cocacola;
	int price;


	public Softdrink()
	{
		System.out.println("Which type of Softdrink you want");
		Scanner sc = new Scanner(System.in);
		 cocacola = sc.nextLine();
		 price = sc.nextInt();
		
	}
		public void cust2 ()
		{
			System.out.println("Customer said="	+"i want"+" "+cocacola);
		}
		public String sprite ()
		{
			System.out.println("ok wait i will give you" +" "+cocacola);
			return cocacola;
		}
		public int rate1 ()
		{
			System.out.println("price of this softdrink is " + price);
			return price;
		}
		public void cust3 ()
		{
			System.out.println(	"Customer said="+"ok Please give me this"+" "+ cocacola);
		}
}
