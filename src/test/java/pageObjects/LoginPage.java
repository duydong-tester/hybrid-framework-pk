package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailTextbox;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	private WebElement loginButton;

	public void enterToEmailTextbox(String emailAddress) {
		emailTextbox.sendKeys(emailAddress);
	}

	public void enterToPasswordTextbox(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
