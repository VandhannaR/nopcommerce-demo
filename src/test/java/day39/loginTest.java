package day39;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	
  WebDriver driver;
  login lp;
  @Test(priority=1)
  void setup() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(1000);
  }
  @Test(priority=2)
  public void testLogo() {
	  lp=new login(driver);
	  
	  Assert.assertEquals(lp.checkLogo(), true);
	  
  }
  @Test(priority=3)
  public void testLogin() {
	  
	  lp.setUserName("Admin");
	  lp.setPassword("admin123");
	  lp.clickSubmit();
	  
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  
	  
  }
  @Test(priority=4)
  public void testTear() {
	  
	  driver.quit();
  }
  
}
