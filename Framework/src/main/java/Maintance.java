import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Maintance {

	
	
//	(//a[@class='oxd-main-menu-item'])[9]  maintance page
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[9]")WebElement maintance;
	
	//input[@name='username'] username textbox
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	
	//input[@name='password'] password textbox
	@FindBy(name = "password")WebElement password;
	
	//button[@type='button'] cancel button 
	@FindBy(xpath = "//button[@type='button']")WebElement cancelbutton;
	
	//button[@type='submit'] confirm button
	@FindBy(xpath = "//button[@type='submit']")WebElement confirmbutton;
	
	
	//confirm page
	
	//span[@class='oxd-topbar-body-nav-tab-item'] purge record drop down
	@FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")WebElement purgrecord;
	//dropdown
	
	//a[text()='Employee Records']  Employee Records
	@FindBy(xpath = "//a[text()='Employee Records']")WebElement empRecord;
	
	//a[text()='Candidate Records']  Candidate Records
	@FindBy(xpath = "//a[text()='Candidate Records']")WebElement candidateRecord;
	
	//button[@class='oxd-button oxd-button--medium oxd-button--secondary'] search button
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")WebElement searchButton;
	
	//li[@class='oxd-topbar-body-nav-tab --visited']/a  access record
	@FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --visited']/a")WebElement accessRecord;
	
	
	//input[@placeholder='Type for hints...'] past employee
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")WebElement pastemployee;
	
	
	
	
	
}
