package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://www.facebook.com");
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dri.findElement(By.id("email")).sendKeys("Trushant");
		dri.findElement(By.xpath("//input[@id='pass']")).sendKeys("8805208277");
		Thread.sleep(3000);
		dri.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		
		dri.findElement(By.name("firstname")).sendKeys("Smita");
		dri.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Dhavan-Solat");
		dri.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8805208279");
		dri.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	
		
		List<WebElement>months=dri.findElements(By.xpath("//select[@name='birthday_month']/option"));
		System.out.println("total months "+months.size());
		
		months.get(10).click();   // nov
		
		Thread.sleep(3000);
		
		WebElement tr = dri.findElement(By.xpath("//select[@id='day']")); 
		Select day = new Select(tr);
		day.selectByVisibleText("28");
		
		Thread.sleep(3000);
		
		WebElement year = dri.findElement(By.xpath("//Select[@id='year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2002");
		

		
		WebElement month = dri.findElement(By.id("month"));
		
		Select mn = new Select(month);
		mn.selectByIndex(2);             // march
		Thread.sleep(3000);
		mn.selectByValue("5");       // may
		Thread.sleep(3000);
		mn.selectByVisibleText("Jun");
		
		Thread.sleep(3000);
		
//		List<WebElement>mon =dri.findElements(By.xpath("//select[@id='month']/option"));
//		for(int i=0; i<=mon.size(); i++) {
//			String dropvalues = mon.get(i).getText();
//			System.out.println(dropvalues);
//			if(dropvalues.equalsIgnoreCase("Feb")) {
//				mon.get(i).click();
//			}
//					
//		}
		
		List<WebElement>gender = dri.findElements(By.xpath("//span[@data-name='gender_wrapper']/span"));
		for(WebElement gen:gender) {
			System.out.println(gen.getText());
			if(gen.getText().equalsIgnoreCase("Female")) {
				gen.click();
			}
		}
		
		
		
		
		

		

		
	
		
		
	
	//	dri.close();

	}
	

}
