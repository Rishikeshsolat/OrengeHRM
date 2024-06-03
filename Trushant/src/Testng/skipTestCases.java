package Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipTestCases {
	
	@Test(enabled=false)
	public void a() {
		System.out.println(" a method");
	}
	
	@Test
	public void b() {
		System.out.println("b method");
	}
	
	@Test(invocationCount=2)
	public void c() {
		System.out.println("c method");
	}
	
	@Test(invocationCount=0)
	public void d() {
		System.out.println("d method");
	}
	
	
	public void e() {
		System.out.println("e method");
		throw new SkipException("SkipException method");
	}

}
