package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.YSctsus;
import com.mohs10.or.YShomepage;
import com.mohs10.or.YSloginpage;

public class yourshop {
	
	public Action aDriver;
	public WebDriver driver;
	
	public yourshop() 
	{
		aDriver =new Action();
		driver =StartBrowser.driver;
	}
	
	public void signin(String email, String Password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("user signin ");
		aDriver.navigateToApplication("https://demo.opencart.com/index.php?route=common/home");
		aDriver.click(YShomepage.Myacc, "click on myaccount btn");
		aDriver.click(YShomepage.login, "click on login btn btn");
		aDriver.type(YSloginpage.txtemail, email, "entering mail id");
		aDriver.type(YSloginpage.txtped, Password, "entering pwd");
		aDriver.click(YSloginpage.btnlogin, "click on login btn");
		aDriver.click(YShomepage.btnctus, "click on contact us btn");
	}
	public void contactus(String name, String Email, String query) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Contact Us");
		//aDriver.navigateToApplication("https://demo.opencart.com/index.php?route=common/home");
		
		aDriver.type(YSctsus.txtname, name,"giving name");
		aDriver.type(YSctsus.txtmail, Email, "giving mail");
		aDriver.type(YSctsus.txtquery, query,"Entering query text");
		aDriver.click(YSctsus.btnsubmit, "click on submit btn");
		//aDriver.click(YSctsus.btncontinue, "click on continue btn");
		
		
	}

}
