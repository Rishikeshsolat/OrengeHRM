package com.febbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Frameclass{
    public static void main(String[] args) throws InterruptedException {
      /*  WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.switchTo().frame(3);
        //iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']

        List<WebElement> elementsToBeDragged = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        WebElement elementDragTo = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions act = new Actions(driver);
        for (WebElement ele : elementsToBeDragged) {
            act.dragAndDrop(ele,elementDragTo).build().perform();
        }*/
WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("	https://jqueryui.com/droppable/");
		
		// switch to frame
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames "+frames.size());
		
		for(int i=0; i<frames.size(); i++) {
			driver.switchTo().frame(i);                                        // switch method use to switch on frame
			if(driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed())
			{
				Thread.sleep(3000);
				Actions act = new Actions(driver);
				act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
				
				System.out.println("drag and drop action perform done");
			}
		}
    }
}