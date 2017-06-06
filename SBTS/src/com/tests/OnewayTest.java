package com.tests;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.modules.LoginTestModules;
import com.resource.PropertiesCache;
import com.utils.GenericMethods;
import com.utils.PageRequisites;

public class OnewayTest  extends LoginTestModules {
	
	/**
	 *@ Initialize Driver and loading Object Repository 
	 */
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
			
			loginAndVerifyTitle(pageRequisites);
			
			System.currentTimeMillis();
		} catch (Exception e) {
			System.currentTimeMillis();
			e.printStackTrace();
		}
	}
	
}
