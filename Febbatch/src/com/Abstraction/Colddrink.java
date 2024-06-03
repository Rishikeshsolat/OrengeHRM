package com.Abstraction;
// Child class
public class Colddrink extends Abstraction
{
 // child class must have to override parent class method to compile the program
	@Override
	public void pepsico(String slice, int price) {
		System.out.println("My "+ slice +" is testy and its price is "+price);
		
	}

	@Override
	public void cola(String redbull, int price, int quntity) {
		System.out.println("My Ab"+redbull + " is testy and its price is "+price +" and i want "+quntity+" quntity");
		
	}
	

}
