package com.febbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerta

{
	public static void main(String[] args) throws InterruptedException {
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		drive.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		WebElement ele =drive.findElement(By.xpath("//button[@id='alertButton']"));
		ele.click();
		Thread.sleep(5000);

		Alert alert =drive.switchTo().alert();
		alert.accept();
		
	}
	
}
