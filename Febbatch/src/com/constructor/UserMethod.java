// No arugument method
package com.constructor;

public class UserMethod {
	int age;        //variable intilize
	String colour;  //variable intilize
					   //Syntax = acess specifier  class name (){
	
	public UserMethod(int age1, String colour1) //
	
	{
		age = age1;				
		colour = colour1;
		System.out.println("MY dog age is"+" "+ age1 + " "+" and his colour is"+" "+ colour1);

		// dog(age,colour);    //dog method called
	}
	
	public void dog(int age1, String colour1) {
		//System.out.println("MY dog age is"+" "+ age1 + " "+" and his colour is"+" "+ colour1);
	}

}
