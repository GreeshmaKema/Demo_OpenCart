package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.Home_Brand;

public class Function_Brand {
	
	public Action  aDriver;
	public WebDriver driver;

public Function_Brand()
{
	aDriver = new Action();
	driver = StartBrowser.driver;
}
public void Brand() throws Exception
{
	StartBrowser.childTest =StartBrowser.parentTest.createNode("Brand name");
	aDriver.navigateToApplication("https://demo.opencart.com/");
	aDriver.click( Home_Brand.lnkMyAccount, "Go to my account link");
	aDriver.click( Home_Brand.lnkLogin, "click on login");
	aDriver.type( Home_Brand.txtEmail, "sumitra.sahoo@mohs10.io", "Type Email Address");
	aDriver.type( Home_Brand.txtPW, "123456789","Password");
	aDriver.click( Home_Brand.btnLogin, "click on login");
	aDriver.click( Home_Brand.lnkBrand, "click on brand");
	aDriver.click( Home_Brand.lnkApple, "click on apple brand");
	aDriver.click( Home_Brand.lnkMacBook, "click on macBook");
	aDriver.click( Home_Brand.btnAddtoCart, "Add to cart btn");
	aDriver.click( Home_Brand.lnkCart, "Click on cart link");
	aDriver.click( Home_Brand.lnkViewCart, "View cart");
}

}
