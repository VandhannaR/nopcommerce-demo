package day34;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class secondTest {

WebDriver driver;
  
  
  @Parameters({"browser","url"})
  @Test
  public void setup(String br,String app) {
	if(br.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
	}
	else if(br.equals("edge")) {
		 WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
	}
	else {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    driver.get(app);
    driver.manage().window().maximize();
  }
  @Test(priority=1)
  public void testlogo() {
	  
	try {
		  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		    Assert.assertEquals(status, true);
	}
	catch(Exception e){
		Assert.fail();
		
	}
  
  }
  @Test(priority=2)
  public void testhomepage() {
    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  @Test(priority=3)
  public void logout() {
	  driver.close();
  }
}

