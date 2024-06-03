package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSwitchTo {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.navigate().to("https://demoqa.com/alerts");
		dri.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement simplealrt = dri.findElement(By.xpath("//button[@id='alertButton']"));
		simplealrt.click();
		Thread.sleep(2000);
		dri.switchTo().alert().accept();
		System.out.println("simple Alert handle");
		Thread.sleep(2000);
		WebElement comfrm = dri.findElement(By.xpath("//button[@id='confirmButton']"));

		comfrm.click();
		Thread.sleep(2000);
		dri.switchTo().alert().accept();
		System.out.println("comfrm alert handle");
		Thread.sleep(2000);
		WebElement prompt = dri.findElement(By.xpath("//button[@id='alertButton']"));
		prompt.click();
		Thread.sleep(2000);
		dri.switchTo().alert().sendKeys("Trushant");
		dri.switchTo().alert().accept();
		System.out.println("prompt alert handle");

	}

}
