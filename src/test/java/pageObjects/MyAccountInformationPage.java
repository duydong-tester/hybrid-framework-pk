package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class MyAccountInformationPage extends BasePage {

	public MyAccountInformationPage(WebDriver driver) {
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

	public String getFirstNameTextboxValue() {
		return firstNameTextbox.getAttribute("value");
	}

	public String getLastNameTextboxValue() {
		return lastNameTextbox.getAttribute("value");
	}

	public String getEmailTextboxValue() {
		return emailTextbox.getAttribute("value");
	}

	public String getTelephoneTextboxValue() {
		return telephoneTextbox.getAttribute("value");
	}

}
