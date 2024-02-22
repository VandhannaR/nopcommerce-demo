package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MyAccountPage extends BasePage{
	
	public WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css=".ico-account")  WebElement myAccount;
	
	@FindBy(css=".ico-logout") WebElement logOut;
	
	
  public boolean isMyAccountPageExists() {
	  try {
		  return(myAccount.isDisplayed());
	  }
	  catch(Exception e) {
		  return(false);
	  }
  }
 
  public void logout() {
	  logOut.click();
	  
  }
}
