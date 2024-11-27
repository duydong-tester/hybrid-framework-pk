package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePage;
import pageObjects.RegisterAccountPage;

public class TC_01_Register extends BaseTest {
	String firstName, lastName, emailAddress, telephone, password;

	@Test
	public void Register() {
		firstName = "Dong";
		lastName = "Do";
		emailAddress = "dongsdet" + getRandomNumber() + "@gmail.com";
		telephone = "0123456789";
		password = "SeJava4@";

		log.info("Register Testing");
		HomePage homePage = new HomePage(driver);

		log.info("Click the 'My account' header dropdown");
		homePage.clickMyAccountHeaderDropdown();

		log.info("Click the 'Register' link");
		homePage.clickRegisterLink();

		RegisterAccountPage registerAccountPage = new RegisterAccountPage(driver);

		log.info("Enter '" + firstName + "' into the Firstname textbox");
		registerAccountPage.enterToFirstNameTextbox(firstName);

		log.info("Enter '" + lastName + "' into the Lastname textbox");
		registerAccountPage.enterToLastNameTextbox(lastName);

		log.info("Enter '" + emailAddress + "' into the Email textbox");
		registerAccountPage.enterToEmailTextbox(emailAddress);

		log.info("Enter '" + telephone + "' into the Telephone textbox");
		registerAccountPage.enterToTelephoneTextbox(telephone);

		log.info("Enter '" + password + "' into the Password textbox");
		registerAccountPage.enterToPasswordTextbox(password);

		log.info("Enter '" + password + "' into the Confirm Password textbox");
		registerAccountPage.enterToConfirmPasswordTextbox(password);

		log.info("Check the 'PrivacyPolicy' checkbox");
		registerAccountPage.checkPrivacyPolicyCheckbox();

		log.info("Click the 'Register' button");
		registerAccountPage.clickContinueButton();

		log.info("Validating the expected message");
		Assert.assertEquals(registerAccountPage.getRegisterSuccessTitle(), "Your Account Has Been Created!");
	}

}
