package com.tests;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.modules.LoginApplicationModule;
import com.page.LoginPage;
import com.pageImplementation.LoginPageImpl;
import com.resource.PropertiesCache;
import com.tests.base.BaseTestCase;
import com.utils.GenericMethods;
import com.utils.PageRequisites;

public class LoginToApplication extends LoginApplicationModule

{
	@BeforeMethod
	public void initialise() {
		driver = GenericMethods.getDriver(PropertiesCache.getInstance().getProperty("browser"));
		GenericMethods.loadObjectRepository();
		testCaseName = "TestLoginForApplicaion";
		Map<String, String> tesDataValuesMap = GenericMethods.loadPageData("src/com/resource/loginandverifydata.xml");
		pageRequisites = new PageRequisites(driver, tesDataValuesMap);
		 
	};

	/**
	 * 
	 */
	@Test
	public void loginAndVerifyTitle() throws Exception {
		try {
			System.currentTimeMillis();
			
			driver.get(PropertiesCache.getInstance().getProperty("baseUrl1"));
			GenericMethods.maxiWindow();
			
			loginVerify(pageRequisites);
			
			System.currentTimeMillis();
		} catch (Exception e) {
			System.currentTimeMillis();
			e.printStackTrace();
		}
	}
	
	
	
	
}
