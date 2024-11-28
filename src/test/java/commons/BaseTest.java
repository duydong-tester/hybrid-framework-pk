package commons;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;
	protected Logger log = LogManager.getLogger(this.getClass());

	@Parameters("browser")
	@BeforeClass
	protected void beforeClass(String browserName) {
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid Browser name [" + browserName.toUpperCase() + "]");
			return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/");
		log.info("----------[Run test on " + browserName.toUpperCase() + "]----------");
	}

	@AfterClass
	protected void afterClass() {
		driver.quit();
	}

	protected int getRandomNumber() {
		return new Random().nextInt(10000);
	}

}
