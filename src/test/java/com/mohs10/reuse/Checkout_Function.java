package com.mohs10.reuse;

import com.mohs10.base.StartBrowser;
import com.mohs10.or.Checkoutpage;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;

public class Checkout_Function {
	
	public Action aDriver;
	public WebDriver Driver;

	public Checkout_Function()
	{
	aDriver = new Action();
	Driver = StartBrowser.driver;
	
 }

public void Tablets() throws Exception{
	StartBrowser.childTest=StartBrowser.parentTest.createNode("Choose a product");
	aDriver.navigateToApplication("https://demo.opencart.com/");
	aDriver.click(Checkoutpage.lnkTblets, "Tablets link");
	aDriver.click(Checkoutpage.imgprdct,"product image");
    aDriver.click(Checkoutpage.btnAddtocart, "Add to cart");
    aDriver.click(Checkoutpage.btnItem, "View item");
    aDriver.click(Checkoutpage.txtCart, "View cart");
    aDriver.click(Checkoutpage.btnChckout, "Checkout");
}

}
