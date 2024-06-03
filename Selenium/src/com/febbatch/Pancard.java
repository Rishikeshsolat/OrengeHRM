package com.febbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pancard {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#left-icon-tab1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("select2-type-container")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//li[text()='New PAN - Indian Citizen (Form 49A)']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("select2-cat_applicant1-container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='INDIVIDUAL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("select2-rvNameInitials-container")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//li[text()='Shri']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='l_name_end']")).sendKeys("solat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='f_name_end']")).sendKeys("rishikesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='m_name_end']")).sendKeys("BHANUDAS");
		Thread.sleep(2000);
		driver.close();
		

	}

}
