package com.febbatch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		drive.findElement(By.name("q")).sendKeys("Amazon");
		List<WebElement> amz= drive.findElements(By.xpath("(//div[@class='wM6W7d'])/span/b"));
		amz.get(0).click();
		drive.findElement(By.xpath("//span[text()='Shop online at Amazon India | Great deals on Amazon']")).click();
		drive.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		List<WebElement> sh= drive.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div"));
		sh.get(1).click();
	}

}
