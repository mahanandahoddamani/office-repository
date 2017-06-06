package com.page;

import java.io.FileNotFoundException;

import com.page.base.BasePage;

public interface RegisterPage extends BasePage
 {
    public String myAccount="myAccount";
    public String signup="signup";
    public String name="name";
    public String mobile= "mobile";
    public String email  = "email";
    public String password ="password";
    public String retypePassword="retypePassword";
    
    public String terms="terms";
    public String register="register";
    
    public void registerUser(String recordId) throws FileNotFoundException;
    
}
