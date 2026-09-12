package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	@FindBy(id="Email")
	WebElement UsernameTextBox;
	@FindBy(id="Password")
	WebElement PasswordTextBox;
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement LogInBTN;
	
//	private By UsernameTextBox =By.id("Email");
//	private By PasswordTextBox =By.id("Password");
//	private By LogInBTN =By.xpath("//button[normalize-space()='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void interUsername(String Username) {
		UsernameTextBox.clear();
		UsernameTextBox.sendKeys(Username);
//		driver.findElement(UsernameTextBox).clear();
//		driver.findElement(UsernameTextBox).sendKeys(Username);
	}
	
	public void interPassword(String Password) {
		PasswordTextBox.clear();
		PasswordTextBox.sendKeys(Password);
//		driver.findElement(PasswordTextBox).clear();
//		driver.findElement(PasswordTextBox).sendKeys(Password);
	}
	
	public void clickOnLogin() {
		LogInBTN.click();
		//driver.findElement(LogInBTN).click();
	}
	

}
