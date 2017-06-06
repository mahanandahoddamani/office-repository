package com.tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import com.utils.GenericMethods;
import com.utils.PageRequisites;

public class BaseTestCase {
	protected String testCaseName="";

	protected WebDriver driver = null;
	protected PageRequisites pageRequisites = null;
	

	@AfterMethod
	public void closeInstance() {
	//	extent.close();
		//Oextent.flush();
		GenericMethods.closeAllWindows();
	}
	/*@DataProvider(name="dataProvidor")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("D:/sampledoc.xls","Sheet1");
		return arrayObject;
	}
}*/



	@DataProvider(name="dataProvidor")
	public Object[][] getData()
	{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];
		

		return data;
	}
}