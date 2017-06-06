package com.page.base;

import org.apache.log4j.Logger;

public interface BasePage {
	static Logger log = Logger.getLogger(BasePage.class.getName());
	public String getPageName();
}
