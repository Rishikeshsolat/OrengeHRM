package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://jqueryui.com/droppable/");
		dri.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement frame = dri.findElement(By.tagName("iframe"));
		dri.switchTo().frame(frame);
		Thread.sleep(3000);
		WebElement drag = dri.findElement(By.id("draggable"));
		WebElement drop = dri.findElement(By.id("droppable"));
		Actions act = new Actions(dri);
		act.dragAndDrop(drag, drop).build().perform();

	}

}
