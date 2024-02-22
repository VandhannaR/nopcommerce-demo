package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#Email")
	WebElement email;
	@FindBy(css = "#Password")
	WebElement password;

	@FindBy(css = "button[class='button-1 login-button']")
	WebElement logInButton;

	public void setEmail(String emailID) {
		email.sendKeys(emailID);
	}

	public void setPassword(String pwd) {
		 password.sendKeys(pwd);
	}

	public void clickLogin() {
		logInButton.click();
	}

}



