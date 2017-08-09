package bookings;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import startOver.Base;
import supportMethods.HotelMethods;

public class HotelBooking {
	

	HotelMethods hm = new HotelMethods();
	Base base =new Base();
	@BeforeTest
	public void checkBrowser() {
		
	/*hm.getDriver();
		hm.getUrl();*/
	Base.checkBrowserExistance();
hm.getUrl();
	}

	@Test
	public void vv() {
		hm.selectHotelHome();
		System.out.println("rfrrf");
	
	//hm.goingTo("Bangalore");
	}
}
