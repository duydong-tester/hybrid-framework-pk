package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[@class='dropdown']/a[@title='My Account']")
	private WebElement myAccountHeaderDropdown;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]//a[text()='Register']")
	private WebElement registerLink;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]//a[text()='Login']")
	private WebElement loginLink;

	public void clickMyAccountHeaderDropdown() {
		myAccountHeaderDropdown.click();
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

	public void clickLoginLink() {
		loginLink.click();
	}

}
