package com.mohs10.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
	//Searching for a Macbook product
	@Test
	public void searchTestCase() throws Exception {
		CommonFuns srch = new CommonFuns();
	    srch.search("MacBook Pro");
	    String prodName= srch.prodName();
		Thread.sleep(5000);
	}
	
	//Searching for a Cam product available in dashboard
	@Test
	public void searchProdTestCase() throws Exception {
		CommonFuns srch = new CommonFuns();
	    srch.search("Cameras");
	    String prodcam = srch.prodCam();
	    Thread.sleep(5000);
	}
	//searching for a iphone product
		@Test
		public void searchiPhoneProdTestCase() throws Exception {
			CommonFuns srch = new CommonFuns();
		    srch.search("iphone");
		    String prodiPhone = srch.prodiPhone();
		    Thread.sleep(5000);
		}
		//search without entering keyword
		@Test
		public void srchTestCase() throws Exception {
			CommonFuns srch = new CommonFuns();
		    srch.searchwithoutkeyword();
			Thread.sleep(5000);
		}
		//search with single character
				@Test
				public void search_SingleCharTestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("t");
				    String prodTouchhd = srch.prodTouchhd();
					Thread.sleep(5000);
				}
		// search with special characters in searchbox
				@Test
				public void search_SpclCharTestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("@*%#");
				    String prodcam= srch.prodCam();
					Thread.sleep(5000);
				}
		// search with numerics in searchbox		
				@Test
				public void search_NumericsTestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("10");
				    String prodSamsung= srch.prodSamsung();
					Thread.sleep(5000);
				}
		//search with alpha-numeric characters
				@Test
				public void search_AlphaNumericsTestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("5d");
				    String prodCanon= srch.prodCanon();
					Thread.sleep(5000);
				}
		//search with alpha-numeric & special characters		
				@Test
				public void search_AlphaNum_SpclChar_TestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("apple 30\"");
				    String prodApple= srch.prodApple();
					Thread.sleep(5000);
				}
				//verify auto suggestion
				@Test
				public void auto_suggestion_TestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("tab");
					Thread.sleep(2000);
				}
				//search & give review
				@Test
				public void Review_TestCase() throws Exception {
					CommonFuns srch = new CommonFuns();
				    srch.search("imac");
				    String prodiMac = srch.prodiMac("Tester", "For any day-to-day task, and most photo and video editing, the iMac does a great job.");
					Thread.sleep(5000);
				}
				
			}
	