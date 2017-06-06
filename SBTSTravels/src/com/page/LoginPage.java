package com.page;

import java.io.FileNotFoundException;

import com.page.base.BasePage;

public interface LoginPage extends BasePage {
	public String myAccount="myAccount";
	public  String userName = "userName";
	public  String password = "password";
	public String login="login";
	
	public void loginToApplication(String recordId) throws FileNotFoundException;
}
