package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class RegisterAccountPage extends BasePage {

	public RegisterAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameTextbox;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameTextbox;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailTextbox;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneTextbox;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordTextbox;

	@FindBy(xpath = "//b[text()='Privacy Policy']/parent::a/following-sibling::input[@type='checkbox']")
	private WebElement privacyPolicyCheckbox;

	@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement registerSuccessMessage;

	public void enterToFirstNameTextbox(String firstName) {
		firstNameTextbox.sendKeys(firstName);
	}

	public void enterToLastNameTextbox(String lastName) {
		lastNameTextbox.sendKeys(lastName);
	}

	public void enterToEmailTextbox(String emailAddress) {
		emailTextbox.sendKeys(emailAddress);
	}

	public void enterToTelephoneTextbox(String telephone) {
		telephoneTextbox.sendKeys(telephone);
	}

	public void enterToPasswordTextbox(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void enterToConfirmPasswordTextbox(String password) {
		confirmPasswordTextbox.sendKeys(password);
	}

	public void checkPrivacyPolicyCheckbox() {
		if (!privacyPolicyCheckbox.isSelected()) {
			privacyPolicyCheckbox.click();
		}
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public String getRegisterSuccessTitle() {
		return registerSuccessMessage.getText();
	}

}
