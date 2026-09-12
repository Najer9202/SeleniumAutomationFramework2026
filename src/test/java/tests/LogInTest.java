package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.LoginPage;
import utils.ExcelUtils;
import utils.ExtentReportManager;
import utils.Log;

public class LogInTest extends BaseTest {
	
	@DataProvider(name="LoginData")
	public Object[][] getLoginData() throws IOException{
		
		String filePath = System.getProperty("user.dir")+"/testdata/TestData.xlsx";
		ExcelUtils.loadExcel(filePath, "Sheet1");
		int rowCount = ExcelUtils.getRowCount();
		Object[][] data = new Object[rowCount-1][2];
		
		for(int i=1; i<rowCount; i++) {
			
			data[i-1][0] = ExcelUtils.getCellData(i, 0);	// Username
			data[i-1][1] = ExcelUtils.getCellData(i, 1);	// Password
		}
		ExcelUtils.closeExcel();
		return data;
	}
	
	
	@Test(dataProvider = "LoginData")
	public void testValidLogIn(String username,String password) throws InterruptedException {
		
		Log.info("Starting Login Test");
		test = ExtentReportManager.createTest("Login Test - "+username);
		test.info("Navigating to URL");
		LoginPage login=new LoginPage(driver);
		Log.info("Adding Credentails");
		test.info("Adding Credentails");
//		login.interUsername("admin@yourstore.com");
//		login.interPassword("admin");
		login.interUsername(username);
		login.interPassword(password);
		
		test.info("Clicking on Login button");
		login.clickOnLogin();
		Thread.sleep(5000);
		Log.info("Validating the title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		test.pass("Login Successful");
		
	}
	
	

}
