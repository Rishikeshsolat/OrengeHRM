package com.febbatch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	public static void main(String[] args) {
		
	WebDriver drive = new ChromeDriver();
	drive.navigate().to("https://www.flipkart.com/");
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	drive.switchTo().newWindow(WindowType.TAB);
	drive.get("https://www.amazon.in/");
	}
}
