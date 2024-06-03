package com.febbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kirsha {
	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.com/");
		drive.manage().window().maximize();
		drive.findElement(By.name("q")).sendKeys("Passport");
		
	}
	

}