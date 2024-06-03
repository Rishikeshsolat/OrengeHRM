package com.febbatch;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws Exception {
		
		WebDriver drive = new ChromeDriver(); 	// In webdriver crome window open , drive is a reff. variable
		drive.manage().window().maximize();				// automation window get maximize
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  //wait given to all elements
		
		drive.get("https://jqueryui.com/droppable/"); 
		Thread.sleep(2000);
		drive.switchTo().frame(0);  //frame value = 1 ( index = 0 )
		Thread.sleep(2000);
		
		//1st way create webelement one by one
		
		//div[@id='draggable']  	// drag me
		//WebElement ele = drive.findElement(By.xpath("//div[@id='draggable']"));
		//Thread.sleep(2000);
		// //div[@id='droppable']   // drop hear
		//WebElement eledraggedTO = drive.findElement(By.xpath("//div[@id='droppable']"));
		//Thread.sleep(2000);
		
		
		Actions act = new Actions(drive);   // Action class interface , act is reff variable , webdrivers action method called.
		Thread.sleep(2000);
		//act.dragAndDrop(ele, eledraggedTO).build().perform();
			// 2nd way by direct putting x path in drag and drop
		act.dragAndDrop(drive.findElement(By.xpath("//div[@id='draggable']")),drive.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		System.out.println("drag and drop action perform done");

	}

}
