package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='content']/h2[text()='My Account']")
	private WebElement myAccountHeaderContent;

	@FindBy(xpath = "//h2[text()='My Account']/following-sibling::ul//a[text()='Edit your account information']")
	private WebElement editYourAccountInformationLink;

	public boolean isMyAccountHeaderContentDisplayed() {
		return myAccountHeaderContent.isDisplayed();
	}

	public void clickEditYourAccountInformationLink() {
		editYourAccountInformationLink.click();
	}

}
