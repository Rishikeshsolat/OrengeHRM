package com.constructor;

public class Automobile {

	public static void main(String[] args) {
		
		Car cr = new Car();  // object created to call honda method
		cr.honda();					//honda method called
		Suv sv = new Suv();// object created to call honda method
		sv.suzuki();			// suzuki method called
		//new suzuki();
	}
}
