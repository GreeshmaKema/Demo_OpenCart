package com.mohs10.or;

import org.openqa.selenium.By;

public class Home_Brand {

	public static By lnkMyAccount = By.xpath("//i[@class='fa fa-user']");
	public static By lnkLogin = By.xpath("//a[normalize-space()='Login']");
	public static By txtEmail = By.xpath("//input[@id='input-email']");
	public static By txtPW = By.xpath("//input[@id='input-password']");
	public static By btnLogin = By.xpath("//input[@value='Login']");
	public static By lnkBrand = By.xpath("//a[normalize-space()='Brands']");
	public static By lnkApple = By.xpath("//a[normalize-space()='Apple']");
	public static By lnkMacBook = By.xpath("//div[8]//div[1]//div[2]//div[1]//h4[1]//a[1]");
	public static By btnAddtoCart = By.xpath("//button[@id='button-cart']");
	public static By lnkCart = By.xpath("//span[@id='cart-total']");
	public static By lnkViewCart = By.xpath("//strong[normalize-space()='View Cart']");
	
}
