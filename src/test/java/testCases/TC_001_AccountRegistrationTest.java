package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(priority=2,groups= {"regression","master"})
	public void verify_account_registration()
	{
		logger.info("**** starting TC_001_AccountRegistrationTest  *****");
		
		logger.debug("application logs started......");
		
		try
		{
			HomePage hp=new HomePage(driver);
			hp.clickRegister();
			Thread.sleep(8000);
			logger.info("Clicked on register link");
			
			
			
			
			logger.info("Entering customer details.. ");
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			
			regpage.setFirstName(randomeString().toUpperCase());
			regpage.setLastName(randomeString().toUpperCase());
			regpage.setEmail(randomeString()+"@gmail.com");
			// randomly generated the email
			String password=randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConfirmPassword(password);
			regpage.clickRegister();
		
			logger.info("clicked on continue..");
			
			String confmsg=regpage.getConfirmationMsg();
			
			logger.info("Validating expected message..");
			
			Assert.assertEquals(confmsg, "Your registration completed");
			System.out.println(confmsg);
			
				
		}
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			//Assert.fail();
			System.out.println("error");
			
		}
		
		logger.debug("application logs end.......");
		logger.info("**** finished TC_001_AccountRegistrationTest  *****");
		
	}
}