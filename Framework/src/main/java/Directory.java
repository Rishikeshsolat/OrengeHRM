import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Directory {
	
//	(//a[@class='oxd-main-menu-item'])[8]  directory page
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[8]")WebElement directoryPage;
	
	//input[@placeholder='Type for hints...']  employ name text
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")WebElement employename;
	
//	(//div[@class='oxd-select-text oxd-select-text--active'])[1]
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")WebElement jobtitle;
	
//	(//div[@class='oxd-select-text oxd-select-text--active'])[2]  location
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")WebElement location;
	
	//button[@class='oxd-button oxd-button--medium oxd-button--ghost']  reset
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")WebElement resetbutton;
	
	//button[@type='submit']  search
	@FindBy(xpath = "//button[@type='submit']")WebElement searchbutton;
	

}
  