package supportMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelMethods {
	public static WebDriver driver;

	 /*public HotelMethods(WebDriver driver) {
		 this.driver = driver; }*/
	 
	public void getDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PTBLR-1193\\Downloads\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void getUrl() {
		try {
			driver.get("http://ezzybooking.com/en");
			Thread.sleep(1000);
			System.out.println("wait is over");
		} catch (InterruptedException e) {

		}
	}

	public void selectHotelHome() {
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/div/div/div/ul/li[2]/a"))
					.click();
			System.out.println("clicked");
		} catch (Exception e) {
		}
	}

	public void goingTo(String Going) {
		driver.findElement(By.xpath("//input[@id='hotel_autocomplete']"))
				.click();

		List<WebElement> cities = driver.findElements(By
				.cssSelector(".hotelCityIp .ui-autocomplete-input"));

		for (WebElement city : cities) {
			System.out.println(city);
			String cty = city.getText();
			if (cty.trim().contains(Going)) {

				city.click();
				break;
			}
		}

	}
}
