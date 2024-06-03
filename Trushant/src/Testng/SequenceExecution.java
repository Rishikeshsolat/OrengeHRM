package Testng;

import org.testng.annotations.Test;

public class SequenceExecution {
	
	
	@Test(priority= -10)
	public void a() {
		System.out.println("-10 a method");
	}
	
	@Test(priority= -20)
	public void b() {
		System.out.println("-20 b method");
	}
	
	@Test(priority =0)
	public void c() {
		System.out.println("0 c method");
	}
	
	@Test(priority=2)
	public void d() {
		System.out.println("2 d method");
	}
	
	@Test
	public void a3() {
		System.out.println("a3 Test method");
	}
	
	@Test
	public void s() {
		System.out.println("s Test Method");
	}
	
	@Test
	public void e() {
		System.out.println("e Test Method");
	}
	
	@Test(priority=1)
	public void f() {
		System.out.println("1 f method");
	}

}
