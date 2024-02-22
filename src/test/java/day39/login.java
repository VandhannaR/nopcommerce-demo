package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class login {
	
  public WebDriver driver;
  login( WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  
  @FindBy(xpath="//img[@alt='company-branding']")
  WebElement logo;
  
  
  @FindBy(name="username")
  WebElement name;
  
  @FindBy(name="password")
  WebElement pass;
  
  @FindBy(xpath="//button[normalize-space()='Login']")
  WebElement button;


  
  
  
 /* By logo=By.xpath("//img[@alt='company-branding']");
  By name=By.name("username");
  By pass=By.name("password");
  By button=By.xpath("//button[normalize-space()='Login']");*/
  @Test
  public void setUserName(String username) {
	name.sendKeys(username);
  }
  public void setPassword(String password) {
	  pass.sendKeys(password);
  }
  public void clickSubmit() {
	  button.click();
  }
  public boolean checkLogo() {
	  boolean bool=logo.isDisplayed();
	  return bool;
  }
}
