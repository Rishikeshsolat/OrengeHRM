package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws Exception {
		WebDriver dri  =new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dri.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)dri;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("./ScreenShots/"+"picture"+".png"));
	

	}

}
