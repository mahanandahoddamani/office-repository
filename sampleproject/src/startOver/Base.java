package startOver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {

	 static WebDriver driver;

	
	
	@BeforeSuite
	public static WebDriver checkBrowserExistance() {
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\PTBLR-1193\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		}
		return driver;
	}
	
	

	@AfterSuite
	public void closeDriver() {
		try {
			Thread.sleep(500);
			//driver.quit();
		} catch (Exception e) {

		}

	}


}
