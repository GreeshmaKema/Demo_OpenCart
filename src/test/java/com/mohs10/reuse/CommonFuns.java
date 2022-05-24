package com.mohs10.reuse;
	import org.openqa.selenium.WebDriver;
	import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.Home;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		//go to search field
				public void search(String search) throws Exception
				{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("click searchbox and search for a prod");
				aDriver.navigateToApplication(" https://demo.opencart.com/");
				aDriver.type(Home.txtSearch, search, "search keyword textbox");
				aDriver.click(Home.btnsearch, "search btn");
				}
				public String prodName() throws Exception
				{
					//aDriver.click(HomePage.lnkMacPro, "MacBookPro product");
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
				    String prodNameMacBookPro=aDriver.getText(Home.textProd, "Name of the product");
				    return prodNameMacBookPro;
				}
			//search for a product(cam) available in dashboard(Useful for cam prod & spcl char's text validation)
				public String prodCam() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					String prodcam = aDriver.getText(Home.textcamprod,"get the prod name");
					return prodcam;
				}
			//search for a iphone product and sortby low-high price
				public String prodiPhone() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					String prodiPhone = aDriver.getText(Home.textiPhoneprod,"get the prod name");
					aDriver.click(Home.chkProdDes, "click on checkbox");
					aDriver.click(Home.btnsrch, "search button");
					aDriver.click(Home.ddSortBy, "sortBy low-high");
					return prodiPhone;
					}
				//search without entering keyword
				public void searchwithoutkeyword() throws Exception
				{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("click searchbox and search for a prod");
				aDriver.navigateToApplication(" https://demo.opencart.com/");
				aDriver.click(Home.btnsearch, "search btn");
				}
				//search with single character
				public String prodTouchhd() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					aDriver.click(Home.imgTouchhd, "click on image");
					String prodTouchhd = aDriver.getText(Home.textTouchhd,"get the prod name");
					return prodTouchhd;
				}
				//search with numerics
				public String prodSamsung() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					aDriver.click(Home.imgSamsung, "click on image");
					String prodSamsung = aDriver.getText(Home.textSamsung,"get the prod name");
					return prodSamsung;
				}
				//search with Alpha-numerics
				public String prodCanon() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & Get product Name from search");
					aDriver.click(Home.imgCanon, "click on image");
					aDriver.click(Home.imgCanon1, "click on image 1");
					aDriver.click(Home.btnClose, "click on close button");
					String prodCanon = aDriver.getText(Home.textCanon,"get the prod name");
					return prodCanon;
				}
				 //search with alpha-numeric & special characters	
				public String prodApple() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & Get product Name from search");
					aDriver.click(Home.imgApple, "click on image");
					aDriver.click(Home.classSpecification, "click on specification");
					String prodApple = aDriver.getText(Home.textApple,"get the prod name");
					return prodApple;
				}
				//search & give review
				public String prodiMac(String name, String review) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & give the review");
					aDriver.click(Home.imgiMac, "click on image");
					aDriver.click(Home.classReviews, "click on reviews");
					aDriver.type(Home.className, name, "Enter your name");
					aDriver.type(Home.classReview, review, "Enter review");
					aDriver.click(Home.rdRating, "click on rating radio button");
					aDriver.click(Home.btnContinue, "click on continue button");
					String prodiMac = aDriver.getText(Home.textSuccess,"get the review submitted text");
					return prodiMac;
				}
				
	}

