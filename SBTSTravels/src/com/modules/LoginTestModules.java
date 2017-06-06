package com.modules;

import com.page.MakeMyTripPage;
import com.pageImplementation.MakeMyTripPageImpl;
import com.tests.base.BaseTestCase;
import com.utils.PageRequisites;

public class LoginTestModules  extends BaseTestCase{
	
	
	public void loginAndVerifyTitle(PageRequisites pageRequisites) throws Exception {
		// declaration
		/*HomePage homePage = new HomePageImpl(pageReuisits);
		LoginPage loginPage = new LoginPageImpl(pageReuisits);

		homePage.clickSignIn();
		loginPage.loginToApplication("TC001");
		homePage.verifyTitle();
	}*/
		MakeMyTripPage  makeMyTripPage = new MakeMyTripPageImpl(pageRequisites);
		makeMyTripPage.searchTriptDetails("TC001");
	}
}
