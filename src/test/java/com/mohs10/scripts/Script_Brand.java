package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Function_Brand;

public class Script_Brand extends StartBrowser{
  @Test
  public void Script_BrandTestcase() throws Exception{
	  
	  Function_Brand afs = new Function_Brand();
		afs.Brand();
		Thread.sleep(5000);
  }
}
