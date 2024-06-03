package com.febbatch;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sroll 
{
	public static void main(String[] args) throws Exception {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//div[text()='Top Selling Stationery']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//act.scrollToElement(cart).contextClick().build().perform();
		JavascriptExecutor refv = (JavascriptExecutor)driver;
		refv.executeScript("window.ScrollBy(0,600)");
		Thread.sleep(2000);
		
		cart.click();
	}

}
