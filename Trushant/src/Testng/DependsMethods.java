package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethods {
	
	@Test
	public void a() {
		Assert.assertTrue(3>12);
		System.out.println("a method ");
	}
	
	@Test(dependsOnMethods= {"a"})
	public void b() {
		System.out.println("b method");
	}
	
	@Test
	public void c() {
		Assert.assertTrue(4<12);
		System.out.println("c method");
	}
	
	@Test(dependsOnMethods= {"c"})
	public void d() {
		System.out.println("d method");
	}

}


