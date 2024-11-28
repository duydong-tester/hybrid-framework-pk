package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountInformationPage;
import pageObjects.MyAccountPage;

public class TC_02_Login extends BaseTest {
	String firstName, lastName, emailAddress, telephone, password;

	@Test
	public void Register() {
		firstName = "Dong";
		lastName = "Do";
		emailAddress = properties.getProperty("userEmail");
		telephone = "0123456789";
		password = properties.getProperty("userPassword");

		log.info("Login Testing");
		HomePage homePage = new HomePage(driver);

		log.info("Click the 'My account' header dropdown");
		homePage.clickMyAccountHeaderDropdown();

		log.info("Click the 'Login' link");
		homePage.clickLoginLink();

		LoginPage loginPage = new LoginPage(driver);

		log.info("Enter '" + emailAddress + "' into the Email textbox");
		loginPage.enterToEmailTextbox(emailAddress);

		log.info("Enter '" + password + "' into the Password textbox");
		loginPage.enterToPasswordTextbox(password);

		log.info("Click the 'Login' button");
		loginPage.clickLoginButton();

		MyAccountPage myAccountPage = new MyAccountPage(driver);

		log.info("Validating the 'My Account' header content is displayed");
		Assert.assertTrue(myAccountPage.isMyAccountHeaderContentDisplayed());

		myAccountPage.clickEditYourAccountInformationLink();

		MyAccountInformationPage myAccountInfoPage = new MyAccountInformationPage(driver);

		Assert.assertEquals(myAccountInfoPage.getFirstNameTextboxValue(), firstName);

		Assert.assertEquals(myAccountInfoPage.getLastNameTextboxValue(), lastName);

		Assert.assertEquals(myAccountInfoPage.getEmailTextboxValue(), emailAddress);

		Assert.assertEquals(myAccountInfoPage.getTelephoneTextboxValue(), telephone);
	}

}
