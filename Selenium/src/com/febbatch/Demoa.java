package com.febbatch;


	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demoa {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.selenium.dev/selenium/web/alerts.html");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	System.out.println(driver.getTitle());

	System.out.println(driver.getCurrentUrl());

	WebElement ele =driver.findElement(By.xpath("//p/a[@id='prompt']"));

	   ele.click();
	   
	   Thread.sleep(1000);
	   
	    Alert alert = driver.switchTo().alert();

	    System.out.println(alert.getText());

	alert.sendKeys("ghodke");


	Thread.sleep(10000);

	alert.accept();
	}

	}

