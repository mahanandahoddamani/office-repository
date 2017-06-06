package com.pageImplementation;

import java.io.FileNotFoundException;

import com.page.LoginPage;
import com.pageImpl.base.BasePageImpl;
import com.utils.PageRequisites;

public class LoginPageImpl extends BasePageImpl implements LoginPage  {
	private static final String LOGIN_PAGE = "LoginPage";
	public LoginPageImpl(PageRequisites pageRequisites) {
		super(pageRequisites);
	}

	public String getPageName() {
		return LOGIN_PAGE;
	}

	/**
	 * Method to accept username , password and click on signinbutton 
	 * @param recordId
	 */
	@Override
	public void loginToApplication(String recordId) throws FileNotFoundException {
		try {
			log.debug("Begin Login To Appliation");
			genericMethods.clickElement(myAccount,  getPageName());
			genericMethods.setValueInTextBox(userName, getPageName(), recordId);
			genericMethods.setValueInTextBox(password, getPageName(),recordId);
			genericMethods.clickElement(login,  getPageName());
			genericMethods.getinnerText(myAccount,getPageName());
			log.debug("end Login To Appliation");
		} catch (Exception e) {
			log.error("Exception in loginToApplication");
			throw e;
		} finally{
		}
	}

}
