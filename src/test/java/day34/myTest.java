package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myTest  {
	WebDriver driver;
	 
	  @Test(priority=1)
	  public void logo() {
		  
		 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get(" https://demo.nopcommerce.com/ ");
		    
		    
		    driver.manage().window().maximize();
		    
		    boolean logoimg=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		    Assert.assertEquals(logoimg, true);
	    
	  }

	  @Test(priority=2)
	  public void login() {
		  driver.findElement(By.linkText("Log in")).click();
		  driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("abc123");
		  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		  try {
			  
			  boolean myacc=driver.findElement(By.linkText("My account")).isDisplayed();
			  Assert.assertEquals(myacc, true);
			 
			  
		  }
		  catch(Exception e) {
			  Assert.assertEquals(true, false);
		  }
		 
	  }

	  @Test(priority=3,dependsOnMethods= {"login"})
	  public void test3() {
		  
		 
		  driver.findElement(By.linkText("Log out")).click();
		  boolean reg=driver.findElement(By.linkText("Register")).isDisplayed(); 
		  
		  Assert.assertEquals(reg,true);
	  }
}
