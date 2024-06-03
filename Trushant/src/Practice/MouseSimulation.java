package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dri.get("https://www.flipkart.com/");
		JavascriptExecutor jse =  (JavascriptExecutor)dri;
		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
		Actions act = new Actions(dri);
//		WebElement toy = dri.findElement(By.xpath("//div[text()='Soft Toys']"));
//		act.contextClick(toy).build().perform();
		
		dri.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Mobiles");
		act.sendKeys(Keys.ENTER).build().perform();
	}

}
