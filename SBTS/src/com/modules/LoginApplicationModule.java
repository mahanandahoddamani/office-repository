package com.modules;

import com.page.LoginPage;
import com.pageImplementation.LoginPageImpl;
import com.tests.base.BaseTestCase;
import com.utils.PageRequisites;

public class LoginApplicationModule extends BaseTestCase
{

	public void loginVerify(PageRequisites pageRequisites) throws Exception
	{
	LoginPage login=new LoginPageImpl(pageRequisites);
	login.loginToApplication("TC003");
	}
}
