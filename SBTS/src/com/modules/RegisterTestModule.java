package com.modules;

import com.page.RegisterPage;
import com.pageImplementation.RegisterPageImpl;
import com.tests.base.BaseTestCase;
import com.utils.PageRequisites;

public class RegisterTestModule extends BaseTestCase
 {

	public void registerTest(PageRequisites pageRequisites) throws Exception {
		
		RegisterPage reg= new RegisterPageImpl(pageRequisites);
		reg.registerUser("TC004");
		
		
	}
	
}
