package com.constructor;
import java.util.Scanner;
public class Argument {

	public Argument() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Addition of a and b is = " + sum);
	}

}
