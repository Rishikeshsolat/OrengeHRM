package com.MulyilevelInheritance.constructor;

class Animal
{
	String name;
	
	Animal(String name)
	{
		this.name = name;
		
		//System.out.println(name +"is my animal"); 
	}
	
	public void eat ()
	{
		System.out.println(name +" is eating");
	}
}