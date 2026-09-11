package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By UsernameTextBox =By.id("Email");
	private By PasswordTextBox =By.id("Password");
	private By LogInBTN =By.xpath("//button[normalize-space()='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void interUsername(String Username) {
		driver.findElement(UsernameTextBox).clear();
		driver.findElement(UsernameTextBox).sendKeys(Username);
	}
	
	public void interPassword(String Password) {
		driver.findElement(PasswordTextBox).clear();
		driver.findElement(PasswordTextBox).sendKeys(Password);
	}
	
	public void clickOnLogin() {
		driver.findElement(LogInBTN).click();
	}
	

}
