package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LogInTest extends BaseTest {
	
	@Test
	public void testValidLogIn() throws InterruptedException {
		
		Log.info("Starting Login Test");
		test = ExtentReportManager.createTest("Login Test - ");
		test.info("Navigating to URL");
		LoginPage login=new LoginPage(driver);
		Log.info("Adding Credentails");
		test.info("Adding Credentails");
		login.interUsername("admin@yourstore.com");
		login.interPassword("admin");
		test.info("Clicking on Login button");
		login.clickOnLogin();
		Thread.sleep(5000);
		Log.info("Validating the title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Just a moment...a");
		test.pass("Login Successful");
		
	}
	
	

}
