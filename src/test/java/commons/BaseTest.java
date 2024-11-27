package commons;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	protected Logger log;

	@BeforeClass
	protected void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/");
		log = LogManager.getLogger(this.getClass());
	}

	@AfterClass
	protected void afterClass() {
		driver.quit();
	}

	protected int getRandomNumber() {
		return new Random().nextInt(10000);
	}

}
