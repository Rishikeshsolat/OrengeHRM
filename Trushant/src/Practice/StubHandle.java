package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StubHandle {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dri.get("https://www.google.com/");
		dri.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("how stuff works");
		List<WebElement>lists = dri.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("size of list box is "+lists.size());
		Thread.sleep(3000);
		for(WebElement li:lists) {
			System.out.println(li.getText());
			if(li.getText().equalsIgnoreCase("how stuff works videos")) {
				li.click();
			}
		}
		

	}

}
