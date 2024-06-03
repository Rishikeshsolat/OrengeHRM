package Practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scroll {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor jse =  (JavascriptExecutor)dri;
		jse.executeScript("document.getElementById('text2').value='Trushant'");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		
		Actions act = new Actions(dri);
//		act.contextClick().build().perform();
		WebElement link = dri.findElement(By.partialLinkText("Open New Page"));
		System.out.println(link.getText());		act.contextClick(link).build().perform();
		
		WebElement enterr = dri.findElement(By.xpath("//img[@id='Image1_img']"));
		act.sendKeys(enterr, Keys.ENTER).build().perform();

	}

}
