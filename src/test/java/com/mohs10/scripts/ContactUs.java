package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.yourshop;

public class ContactUs extends StartBrowser{
  @Test
  public void  ContactUsTestCase()  throws Exception{
	  
	//method should be name of reuse class		
			yourshop cfs=new yourshop();
			  cfs.signin("gayatrimohapatra1414@gmail.com","gayatri@123");
			  Thread.sleep(3000);
			 cfs.contactus("Gayatri","gayatrimohapatra1414@gmail.com", "testing");
			  Thread.sleep(3000);
  }
}
