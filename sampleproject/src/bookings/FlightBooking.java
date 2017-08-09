package bookings;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import supportMethods.FlightMethods;
import xlSupport.XLFileReader;

public class FlightBooking {

	FlightMethods fm = new FlightMethods();
	XLFileReader xl = new XLFileReader();

	@BeforeTest
	public void getProject() {
		fm.getDriver();
		fm.getUrl();

	}

	@Test(priority = 0)
	public void oneway() {
		fm.goToHomePage();
		fm.wayType(xl.xlFile(1, 1));
		fm.fromLocation1(xl.xlFile(3, 1));
		fm.toLocation1(xl.xlFile(4, 1));
		fm.departureDate1(xl.xlFile(5, 1), xl.xlFile(6, 1).trim().toString());
		fm.setNumberOfAdults(Integer.parseInt(xl.xlFile(7, 1)));
		fm.setNumberOfChild(Integer.parseInt(xl.xlFile(8, 1)));
		fm.setNumberOfInfant(Integer.parseInt(xl.xlFile(9, 1)));
		fm.clickSearch();
	}

	@Test(priority = 1)
	public void twoWay() {
		fm.goToHomePage();
		fm.wayType(xl.xlFile(5, 2));
		fm.fromLocation1(xl.xlFile(12, 1));
		fm.toLocation1(xl.xlFile(13, 1));
		fm.departureDate1(xl.xlFile(14, 1), xl.xlFile(15, 1).trim().toString());
		fm.returneDate1(xl.xlFile(16, 1), xl.xlFile(17, 1).trim().toString());
		fm.setNumberOfAdults(Integer.parseInt(xl.xlFile(18, 1)));
		fm.setNumberOfChild(Integer.parseInt(xl.xlFile(19, 1)));
		fm.setNumberOfInfant(Integer.parseInt(xl.xlFile(20, 1)));
		fm.clickSearch();
	}

	@Test(priority = 2)
	public void multicity() {
		fm.goToHomePage();
		fm.wayType(xl.xlFile(6, 2));
		fm.fromLocation1(xl.xlFile(23, 1));
		fm.toLocation1(xl.xlFile(24, 1));
		fm.departureDate1(xl.xlFile(25, 1), xl.xlFile(26, 1).trim().toString());
		fm.fromLocation2(xl.xlFile(27, 1));
		fm.toLocation2(xl.xlFile(28, 1));
		fm.departureDate2(xl.xlFile(29, 1), xl.xlFile(30, 1).trim().toString());
		fm.setNumberOfAdults(Integer.parseInt(xl.xlFile(31, 1)));
		fm.setNumberOfChild(Integer.parseInt(xl.xlFile(32, 1)));
		fm.setNumberOfInfant(Integer.parseInt(xl.xlFile(33, 1)));
		fm.clickSearch();
	}

}
