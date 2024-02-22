package testCases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Parameters({"os", "browser"})
	@Test(priority=3,groups= {"sanity","master"})
	
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		try
		{
			//Home page
			HomePage hp=new HomePage(driver);
			hp.clickLogIn();
			logger.info("clicked on login link under myaccount..");
			
			//Login page
			LoginPage lp=new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			logger.info("clicked on ligin button..");
			
			MyAccountPage macc=new MyAccountPage(driver);
	
			boolean targetPage=macc.isMyAccountPageExists();
			
			Assert.assertEquals(targetPage,true);
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");
			
		
		
		
		

		
	
	
	}

}
