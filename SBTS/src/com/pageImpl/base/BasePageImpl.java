package com.pageImpl.base;

import org.openqa.selenium.WebDriver;

import com.page.base.BasePage;
import com.utils.GenericMethods;
import com.utils.PageRequisites;

public abstract class BasePageImpl implements BasePage {
	protected WebDriver driver = null;
	protected GenericMethods genericMethods = null;
	
	protected BasePageImpl(PageRequisites pageRequisites) {
		this.driver = pageRequisites.getDriver();
		this.genericMethods = new GenericMethods(driver , pageRequisites.getTestDataMap());
	}
}
