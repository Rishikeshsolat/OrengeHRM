package com.febbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Classic {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("rishikeshsolat@facebook.in");
	Thread.sleep(2000);

	driver.findElement(By.id("pass")).sendKeys("@4514");
	Thread.sleep(2000);

	WebElement newacc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	newacc.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Rishi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Solat");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8888688109");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Rishi@8805");
	Thread.sleep(2000);
	
	
	//dropdown handle
	
	List<WebElement> months = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
	months.get(9).click();
	Thread.sleep(2000);
//	List<WebElement> days = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
//	days.get(30).click();
//	Thread.sleep(2000);
//	List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']/option"));
//	years.get(30).click();
	
	
	//By using select class
	
	WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select tr = new Select(years);
	tr.selectByValue("2001");
	Thread.sleep(2000);
	
	tr.selectByVisibleText("1996");
	
	WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
	Select dr = new Select(days);
	dr.selectByIndex(28);
	
	Thread.sleep(2000);
	 dr.selectByValue("30");
	
	
	
	
	}
	}

