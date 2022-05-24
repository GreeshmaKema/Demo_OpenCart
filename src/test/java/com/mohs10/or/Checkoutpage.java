package com.mohs10.or;

import org.openqa.selenium.By;

public class Checkoutpage {
	
	public static By lnkTblets = By.xpath("//a[normalize-space()='Tablets']");
 	public static By imgprdct = By.xpath("//img[@title='Samsung Galaxy Tab 10.1']");
 	public static By btnAddtocart = By.xpath("//button[@id='button-cart']");
 	public static By btnItem =By.xpath("//span[@id='cart-total']");
 	public static By txtCart =By.xpath("//strong[normalize-space()='View Cart']");
 	public static By btnChckout = By.xpath("//a[@class='btn btn-primary']");

}
