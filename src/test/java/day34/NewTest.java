package day34;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
  
	@Test(dataProvider="dp")
	void login(String email,String pwd) {
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
		
    }

	
	
	@DataProvider(name="dp",indices= {0,3})
	String[][]loginData(){
		String data[][]= {
			
				{"abc@gmail.com","test123"},
				{"abd@gmail.com","test123"},
				{"vel@gmail.com","test123"},
				{"crazydudet4@gmail.com","Vandhanna@2001"}
		};
		return  data;
	}
	
	@AfterMethod
	void down() {
		driver.close();
		
    }

	/*@Test(priority=3,groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("this is login by twitter");
		
    }

	@Test(priority=4,groups= {"sanity","regression"})
	void signByEmail() {
		System.out.println("this is sign by email");
		
    }

	@Test(priority=5,groups={"regression"})
	void signByFacebook() {
		System.out.println("this is sign by facebook");
		
    }

   /*@Test(priority=2)
	
	void login() {
		Assert.assertTrue(false);
		
	}
	

	/*@Test(priority=2,dependsOnMethods={"openApp"})
	
	void login() {
		Assert.assertTrue(false);
		
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);
		
	}
	
	

	@Test(priority=4,dependsOnMethods= {"openApp"})
	 void logout() {
		Assert.assertTrue(true);
		
	}*/
	
	
	
	
	
	


	
}
