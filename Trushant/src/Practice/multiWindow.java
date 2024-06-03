package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindow {

	public static void main(String[] args) throws Exception {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dri.navigate().to("https://demoqa.com/browser-windows");
		dri.findElement(By.xpath("//button[@id='tabButton']")).click();
	
		Set<String>win =dri.getWindowHandles();
//		System.out.println(win.size());
//		Iterator<String>it = win.iterator();
//		String win1 = it.next();
//		String win2 = it.next();
//		dri.switchTo().window(win2);
//		System.out.println(dri.findElement(By.id("sampleHeading")).getText());
//		dri.switchTo().window(win1);
//		Thread.sleep(3000);
//		dri.navigate().refresh();
	
		
		List<String>winlist = new ArrayList(win);
		for(String wid:winlist) {
			String title = dri.switchTo().window(wid).getTitle();
			System.out.println("title of window "+title);
		}

	}

}
