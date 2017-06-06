package com.pageImplementation;

import com.page.RegisterPage;
import com.pageImpl.base.BasePageImpl;
import com.utils.PageRequisites;

public class RegisterPageImpl extends BasePageImpl implements RegisterPage

{
	private static final String REGISTER_PAGE = "RegisterPage";
	public RegisterPageImpl(PageRequisites pageRequisites) {
		super(pageRequisites);
	}

	
	@Override
	public void registerUser(String recordId)
	{
		genericMethods.clickElement(myAccount, getPageName());
		genericMethods.clickElement(signup, getPageName());
		genericMethods.setValueInTextBox(name, getPageName(), recordId);
		genericMethods.setValueInTextBox(mobile, getPageName(), recordId);
		genericMethods.setValueInTextBox(email, getPageName(), recordId);
		genericMethods.setValueInTextBox(password, getPageName(), recordId);
		genericMethods.setValueInTextBox(retypePassword, getPageName(), recordId);
		
		genericMethods.clickElement(terms, getPageName());
		genericMethods.clickElement(register, getPageName());
	}
	
	@Override
	public String getPageName() 
	{
		return "REGISTER_PAGE";
	}
 

}
