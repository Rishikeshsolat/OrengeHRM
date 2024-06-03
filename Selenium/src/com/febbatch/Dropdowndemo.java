package com.febbatch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo
{
	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		drive.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 
		//1st way , it is not reccommed, most company use it
		// deal with multiple webelemnts using find elements , use findelements webdriver method , return type is = List<Webelement>
		
		List<WebElement> Birthdate = drive.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Total drop down value " + Birthdate.size());
		Birthdate.get(10).click();
		
		// 2nd way mostly use (using select class)
		//use findelement wedriver method , return type is webelement
		
		WebElement tr = drive.findElement(By.xpath("//select[@id='day']")); // tr is a ref. variable / suitcase in  which all element stored
		
		Select day = new Select(tr); // it is a class  day is ref variable
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		day.selectByIndex(15);   // using byb index
		day.selectByValue("18");  // using by selected value
		day.selectByVisibleText("20"); // select 15th date
		
		// 3rd way by using for loop
		
		
		
		
		
		
		
	}

}
