package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyamicTable {

	public static void main(String[] args) {

     WebDriver dri = new ChromeDriver();
     dri.manage().window().maximize();
     dri.get("https://money.rediff.com/gainers");
     dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     List<WebElement> allcompname = dri.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
     System.out.println(allcompname.size());
  
     
     List<WebElement>rows = dri.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
     System.out.println("total Rows "+rows.size());
     
     List<WebElement> coloumn =dri.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
     System.out.println("total coloumn "+coloumn.size());
     
     for(WebElement name:allcompname) {
    	 String nms = name.getText();
    	 if(nms.equalsIgnoreCase("Garware Tech. Fibres")) {
    		 name.click();
    		 System.out.println("click on company");
    	 }
     }

	}

}
