package supportMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import startOver.Base;

public class FlightMethods {

	WebDriver driver;
	WebDriverWait wait;
	Base base = new Base();
	
	/*public FlightMethods(WebDriver  driver){
		this.driver = driver;
	}*/

	public void getDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PTBLR-1193\\Downloads\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void goToHomePage() {
		try {
			driver.findElement(
					By.xpath("//img[@src='http://ezzybooking.com/admin-panel/uploads//logo/1481008207logo.png']"))
					.click();

			Thread.sleep(20000);
		} catch (InterruptedException e) {

		}
	}
	

	public void getUrl() {
		try {
			driver.get("http://ezzybooking.com/en");
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
	}

// / setNumberOfAdults

	public void setNumberOfAdults(int AdultNo) {

		try {
			System.out.println("Expected  Adults_No    " + AdultNo);
			String adult;
			adult = driver.findElement(By.xpath("//*[@id='adult']"))
					.getAttribute("value");

			int AdultCount = Integer.parseInt(adult);

			if ((AdultNo) == AdultCount) {

			} else if (AdultCount < AdultNo) {

				int j = AdultNo - 1;
				for (int i = 1; i <= j; i++) {
					driver.findElement(
							By.xpath("//*[@id='flight']/div/div[3]/div[4]/div/div[1]/div/div/div/div/button[2]/span"))
							.click(); // //// Adults plus button
				}
				Thread.sleep(200);
			}
		} catch (Exception e) {

		}
	}

	// / setNumberOfChilds

	public void setNumberOfChild(int childNo) {
		try {
			System.out.println("Expected  Child_No    " + childNo);
			String child;
			child = driver.findElement(By.xpath("//input[@id='child']"))
					.getAttribute("value");

			int childCount = Integer.parseInt(child);

			if ((childNo) == childCount) {

			} else if (childCount < childNo) {

				int j = childNo;
				for (int i = 1; i <= j; i++) {
					driver.findElement(
							By.xpath("(//button[@type='button'])[7]")).click();
				}
				Thread.sleep(200);
			}
		} catch (Exception e) {

		}
	}

	// / setNumberOfInfants
	public void setNumberOfInfant(int infantNo) {
		try {
			System.out.println("Expected  Infants_No    " + infantNo);
			String infant;
			infant = driver.findElement(By.xpath("//input[@id='infant']"))
					.getAttribute("value");

			int infantCount = Integer.parseInt(infant);

			if ((infantNo) == infantCount) {

			} else if (infantCount < infantNo) {

				int j = infantNo;
				for (int i = 1; i <= j; i++) {
					driver.findElement(
							By.xpath("(//button[@type='button'])[9]")).click();
				}
			}
			Thread.sleep(200);
		} catch (Exception e) {

		}
	}

	public void wayType(String way) {
		try{
		if (way.equalsIgnoreCase("Oneway")) {
			System.out.println(" ------------------------------------------------------------------------------------------------------------------- " );
			driver.findElement(By.xpath("//a[@id='oneway']")).click();			
			System.out.println("WayType --------------------------------- " +way);
			
		}

		else if (way.equalsIgnoreCase("Round Trip")) {
			System.out.println(" ------------------------------------------------------------------------------------------------------------------- " );
			driver.findElement(By.xpath("//a[@id='round']")).click();
			System.out.println("WayType --------------------------------- " +way);
			Thread.sleep(200);
		}

		else if ((way.equalsIgnoreCase("Multy City"))) {
			System.out.println(" ------------------------------------------------------------------------------------------------------------------- " );
			driver.findElement(By.xpath("//a[@id='multicity']")).click();
			System.out.println("WayType --------------------------------- " +way);
			Thread.sleep(200);
		}}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	public void addMoreCities() {
		driver.findElement(By.xpath("//img[@onclick='addFlights()']")).click(); // ////+
																				// button
	}

	public void fromLocation1(String From1) {

		System.out.println("Expected  Departure_Location_1    " + From1);
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys(From1);
		List<WebElement> cities = driver.findElements(By
				.cssSelector("#ui-id-2 .ui-menu-item"));

		for (WebElement city : cities) {

			String cty = city.getText();
			if (cty.trim().contains(From1)) {

				city.click();
				break;
			}
		}

	}

	public void fromLocation2(String From2) {
		System.out.println("Expected  Departure_Location_2    " + From2);
		driver.findElement(By.xpath("//input[@id='from_m_1']")).clear();
		driver.findElement(By.xpath("//input[@id='from_m_1']")).sendKeys(From2);
		List<WebElement> cities = driver.findElements(By
				.cssSelector("#ui-id-4 .ui-menu-item"));

		for (WebElement city : cities) {

			String cty = city.getText();
			if (cty.trim().contains(From2)) {

				city.click();
				break;
			}
		}

	}

	public void toLocation1(String To1) {
		System.out.println("Expected  To_Location-- 1    " + To1);
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys(To1);
		List<WebElement> Tcities = driver.findElements(By
				.cssSelector("#ui-id-3 .ui-menu-item"));

		// ///////// Departure ////////////
		for (WebElement Tcity : Tcities) {

			String Tcty = Tcity.getText();
			if (Tcty.trim().contains(To1))

				Tcity.click();
			break;
		}
	}

	public void toLocation2(String To2) {
		try {
			System.out.println("Expected To_Location-- 2    " + To2);
			driver.findElement(By.xpath("//input[@id='to_m_1']")).sendKeys(To2);
			List<WebElement> Tcities = driver.findElements(By
					.cssSelector("#ui-id-6 .ui-menu-item"));

			// ///////// Departure ////////////
			for (WebElement Tcity : Tcities) {

				String Tcty = Tcity.getText();
				if (Tcty.trim().contains(To2))

					Tcity.click();
				break;
			}
		} catch (Exception e) {

		}
	}

	public void departureDate1(String Month, String DepartureDate) {
		try {
			System.out.println("Expected  Departure_Month_1    " + Month);
			System.out.println("Expected  Departure_Date-- 1    "
					+ DepartureDate);
			for (int k = 1; k <= 12; k++) {
				WebElement tble = driver
						.findElement(By
								.cssSelector(".ui-datepicker-group-first .ui-datepicker-calendar"));
				WebElement month1 = driver.findElement(By
						.cssSelector(".ui-datepicker-title"));
				WebElement month2 = driver
						.findElement(By
								.cssSelector(".ui-datepicker-group-last .ui-datepicker-title"));
				WebElement nextCalender = driver.findElement(By
						.xpath("//span[contains(.,'Next')]"));

				if (month1.getText().contains(Month)) {
					List<WebElement> trows = tble
							.findElements(By.tagName("tr"));

					for (WebElement trow : trows) {
						List<WebElement> tcols = trow.findElements(By
								.tagName("td"));

						for (WebElement tcol : tcols) {

							if (tcol.getText().toString()
									.equalsIgnoreCase(DepartureDate)) {
								tcol.click();
								break;
							}
						}
					}
				}

				else if (month2.getText().contains(Month)) {
					WebElement tble2 = driver
							.findElement(By
									.cssSelector(".ui-datepicker-group-last .ui-datepicker-calendar"));

					List<WebElement> trows = tble2.findElements(By
							.tagName("tr"));

					for (WebElement trow : trows) {
						List<WebElement> tcols = trow.findElements(By
								.tagName("td"));

						for (WebElement tcol : tcols) {

							if (tcol.getText().toString()
									.equalsIgnoreCase(DepartureDate)) {

								tcol.click();
								break;
							}
						}
					}

				} else {
					if (nextCalender.isDisplayed()) {
						nextCalender.click();
					}
				}
			}
		} catch (Exception e) {

		}

	}

	public void departureDate2(String Month, String DepartureDate) {
		try {
			System.out.println("Expected  Departure_Month_2    " + Month);
			System.out.println("Expected  Departure_Date-- 2    "
					+ DepartureDate);
			for (int k = 1; k <= 12; k++) {

				WebElement tble = driver
						.findElement(By
								.cssSelector("#ui-datepicker-div .ui-datepicker-calendar"));
				List<WebElement> trows = tble.findElements(By.tagName("tr"));
				WebElement month1 = driver.findElement(By
						.cssSelector(".ui-datepicker-title"));
				WebElement nextCalender = driver.findElement(By
						.xpath("//span[contains(.,'Next')]"));

				if (month1.getText().contains(Month)) {
					for (WebElement trow : trows) {
						List<WebElement> tcols = trow.findElements(By
								.tagName("td"));

						for (WebElement tcol : tcols) {

							if (tcol.getText().toString()
									.equalsIgnoreCase(DepartureDate)) {

								tcol.click();
								break;
							}
						}
					}

				} else {
					if (nextCalender.isDisplayed()) {
						nextCalender.click();
					}
				}
			}
		} catch (Exception e) {

		}

	}

	public void returneDate1(String Month, String ReturnDate) {
		try {
			System.out.println("Expected  Return_Month_1    " + Month);
			System.out.println("Expected  Return_Date_1    " + ReturnDate);
			Thread.sleep(100);
			WebElement tble = driver
					.findElement(By
							.cssSelector(".ui-datepicker-group-first .ui-datepicker-calendar"));
			WebElement month1 = driver.findElement(By
					.cssSelector(".ui-datepicker-title"));
			WebElement month2 = driver
					.findElement(By
							.cssSelector(".ui-datepicker-group-last .ui-datepicker-title"));
			WebElement nextCalender = driver.findElement(By
					.xpath("//span[contains(.,'Next')]"));

			if (month1.getText().contains(Month)) {
				List<WebElement> trows = tble.findElements(By.tagName("tr"));
				for (WebElement trow : trows) {
					List<WebElement> tcols = trow
							.findElements(By.tagName("td"));

					for (WebElement tcol : tcols) {

						if (tcol.getText().toString()
								.equalsIgnoreCase(ReturnDate)) {
							Thread.sleep(200);

							tcol.click();
							break;
						}
					}
				}

			} else if (month2.getText().contains(Month)) {
				WebElement tble2 = driver
						.findElement(By
								.cssSelector(".ui-datepicker-group-last .ui-datepicker-calendar"));

				List<WebElement> trows = tble2.findElements(By.tagName("tr"));

				for (WebElement trow : trows) {
					List<WebElement> tcols = trow
							.findElements(By.tagName("td"));

					for (WebElement tcol : tcols) {

						if (tcol.getText().toString()
								.equalsIgnoreCase(ReturnDate)) {
							tcol.click();
							break;
						}
					}
				}

			} else {
				if (nextCalender.isDisplayed()) {
					nextCalender.click();
				}
			}
		} catch (Exception e) {

		}

	}

	public void clickSearch() {
		try {
		driver.findElement(By.xpath("//button[contains(.,'Search Flights ')]"))
				.click();
		
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			
		}
	}

}