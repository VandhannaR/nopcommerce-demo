package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css=".ico-register")  WebElement register;
	@FindBy(css=".ico-login")  WebElement logIn;


	
	public void clickRegister() {
		register.click();
	}
	public void clickLogIn() {
		logIn.click();
	}

	
}
