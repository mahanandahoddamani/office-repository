package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import startOver.Base;
import supportMethods.FlightMethods;

public class LoginToEzzyBook {
	WebDriver driver;
	FlightMethods fm = new FlightMethods();
Base base = new Base();

	

	@Test(dataProvider = "getData")
	public void loginAsUser(String User, String Password) {

		driver.findElement(By.cssSelector("div.userorlogin")).click();

		driver.findElement(
				By.xpath("//*[contains(@placeholder,'Email Address')]"))
				.sendKeys(User);
		driver.findElement(
				By.xpath("/html/body/div[3]/div[1]/div[1]/div/ul/li[2]/ul/li[1]/div/div/form/div/div[2]/input"))
				.sendKeys(Password);
		driver.findElement(By.cssSelector(".submitlogin")).click();

	}

	@DataProvider(name = "getData")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "narayan.provab@mail.com", "admin" }, };
	}

	
}
