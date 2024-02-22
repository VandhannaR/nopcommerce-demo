package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public WebDriver driver;

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#FirstName") WebElement firstName;


	@FindBy(css="#LastName")  WebElement lastName;


	@FindBy(css="#Email")  WebElement email;
	

	@FindBy(css="#Password")  WebElement password;
	

	@FindBy(css="#ConfirmPassword")  WebElement confirmPassword;
	
	@FindBy(css="#register-button")  WebElement register;

	@FindBy(css=".result")  WebElement yourRegistrationCompleted;
	
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);

	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);

	}

	public void setEmail(String emailId) {
		email.sendKeys(emailId);

	}


	public void setPassword(String pwd) {
		password.sendKeys(pwd);

	}

	public void setConfirmPassword(String cpwd) {
		confirmPassword.sendKeys(cpwd);

	}

	public void clickRegister() {
		register.click();

	}

	

	public String getConfirmationMsg() {
		try {
			return (yourRegistrationCompleted.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
