package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.LoginPage;
import utils.Log;

public class LogInTest extends BaseTest {
	
	@Test
	public void testValidLogIn() throws InterruptedException {
		Log.info("Starting Login Test");
		LoginPage login=new LoginPage(driver);
		Log.info("Adding Credentails");
		login.interUsername("admin@yourstore.com");
		login.interPassword("admin");
		login.clickOnLogin();
		Thread.sleep(5000);
		Log.info("Validating the title");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
	}
	
	

}
