package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LogInTest extends BaseTest {
	
	@Test
	public void testValidLogIn() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.interUsername("admin@yourstore.com");
		login.interPassword("admin");
		login.clickOnLogin();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
	}
	
	

}
