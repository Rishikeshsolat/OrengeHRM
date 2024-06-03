package com.constructor;
import java.util.Scanner;

public class Car {
	
	public void honda () 
	{

	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int price = sc.nextInt();
	System.out.println(name+ " "+ " this my new car and its price is "+ " "+ price);
	}
	
}

class Suv {
	 
	public void suzuki ()
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int price = sc.nextInt();
		System.out.println(name+ " "+ " this my new car and its price is "+ " "+ price);
	}
}