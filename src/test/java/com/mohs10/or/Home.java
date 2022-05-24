package com.mohs10.or;

import org.openqa.selenium.By;

public class Home {
	
	//goto search
	public static By txtSearch = By.xpath("//input[@placeholder='Search']");
	public static By btnsearch = By.xpath("//i[@class='fa fa-search']");
	public static By textProd = By.xpath("//h1[normalize-space()='Search - MacBook Pro']");
	//search for prod(cam) available in dashboard(Useful for cam prod & spcl char's text validation)
	public static By textcamprod = By.xpath("//p[contains(text(),'There is no product that matches the search criter')]");
	//search for iphone prod
	public static By textiPhoneprod = By.xpath("//h1[normalize-space()='Search - iphone']");
	public static By chkProdDes = By.xpath("//input[@id='description']");
	public static By btnsrch = By.xpath("//input[@id='button-search']");
	public static By ddSortBy = By.xpath("//select[@id='input-sort']/option[@value='https://demo.opencart.com/index.php?route=product/search&sort=p.price&order=ASC&search=iphone&description=true']");
	//search with single character
	public static By imgTouchhd = By.xpath("//img[@title='HTC Touch HD']");
	public static By textTouchhd = By.xpath("//h1[normalize-space()='HTC Touch HD']");
	//search with numerics
	public static By imgSamsung = By.xpath("//img[@title='Samsung Galaxy Tab 10.1']");
	public static By textSamsung = By.xpath("//h1[normalize-space()='Samsung Galaxy Tab 10.1']");
	//search with alpha-numerics
	public static By imgCanon = By.xpath("//img[@title='Canon EOS 5D']");
    public static By imgCanon1 = By.xpath("//li[2]//a[1]//img[1]");
    public static By btnClose = By.xpath("//button[@title='Close (Esc)']");
    public static By textCanon = By.xpath("//h1[normalize-space()='Canon EOS 5D']");
    //search with alpha-numeric & special characters	
    public static By imgApple = By.xpath("//img[@title='Apple Cinema 30\"']");
    public static By classSpecification = By.xpath("//a[normalize-space()='Specification']");
    public static By textApple = By.xpath("//h1[normalize-space()='Apple Cinema 30\"']");
    //search & give review
    public static By imgiMac = By.xpath("//img[@title='iMac']");
    public static By classReviews = By.xpath("//a[normalize-space()='Reviews (0)']");
    public static By className = By.xpath("//input[@id='input-name']");
    public static By classReview = By.xpath("//textarea[@id='input-review']");
    public static By rdRating = By.xpath("//input[@value='4']");
    public static By btnContinue = By.xpath("//button[@id='button-review']");
    public static By textSuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
}
