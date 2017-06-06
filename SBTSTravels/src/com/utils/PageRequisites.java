package com.utils;

import java.util.Map;

import org.openqa.selenium.WebDriver;
public class PageRequisites {
	private WebDriver driver;
	Map<String, String> tesDataValuesMap;
	
	public WebDriver getDriver() {
		return driver;
	}

	public Map<String, String> getTestDataMap() {
		return tesDataValuesMap;
	}


	public PageRequisites(WebDriver driver, Map<String, String> tesDataValuesMap) {
		this.driver = driver;
		this.tesDataValuesMap = tesDataValuesMap;
		
	}

}
