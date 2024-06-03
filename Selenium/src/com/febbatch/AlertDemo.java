package com.febbatch;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
	
		WebElement element = Driver.findElement(By.xpath("//div[@class='col']/button"));
		
		element.click();
		Alert al = Driver.switchTo().alert();
		al.accept();
		
		WebElement element1 = Driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		
//		element1.click();
//		Thread.sleep(5000);
//		Alert ale = Driver.switchTo().alert();
//		ale.accept();
		
		WebElement element2 = Driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
		element2.click();
		Alert aler = Driver.switchTo().alert();

		aler.dismiss();
		WebElement element3 = Driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		element3.click();
		Alert alert = Driver.switchTo().alert();

		alert.getText();
		Driver.close();
		
		
	}

}