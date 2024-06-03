package com.febbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vechical {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Maruti suzuki");
		Thread.sleep(1000);
		List<WebElement> car = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		car.get(3).click();
		System.out.println(car.size());
		for (WebElement Xl: car) {
			if(Xl.getText().equals("maruti suzuki ertiga")) {
				Xl.click();
			}
		}
	}

}
