package com.constructor;

public class Count {

	private static int count;  
	//constructor of the class  
	public Count()   
	{  
	// increase the count variable by 1  
	count++;  
	}  
	public static void main(String args[])   
	{  
	//creating objects  
	Count ob1 = new Count();  
	Count ob2 = new Count();  
	Count ob3 = new Count();  
	Count ob4 = new Count();  
	Count ob5 = new Count();  
	//prints number of objects  
	System.out.print("Total Number of Objects: " + Count.count);  
	}
}
