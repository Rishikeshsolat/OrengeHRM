package com.SingleInheritance.constructor;
import java.util.Scanner;
public class SingleInheritance {
	String drinktype;
	int price;
	  public SingleInheritance() 
	{
			System.out.println("which type of drink you want");

		Scanner sc = new Scanner(System.in);
		
		 drinktype = sc.nextLine();
		 price = sc.nextInt();
		
	}
	  public void custmor () {
		  System.out.println("Customer said=" +	"I want"+" "+ drinktype);
		 
	  }
		public String soda ()
	{
			System.out.println(	"My new soda flavour is" +" "+drinktype);
			return drinktype;
	}
		public int rate () 
	{
			System.out.println("and MY new soda price is "+" "+price);
			return price;
	}	
		public void cust () 
		{
			System.out.println("Customer said=" + "Please give me this"+" "+drinktype); 
		}
		
		
}
