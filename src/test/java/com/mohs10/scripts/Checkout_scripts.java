package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.Checkout_Function;

public class Checkout_scripts extends StartBrowser{
  @Test
  public void  Checkout_scriptsTestcases() throws Exception {
	  Checkout_Function cfs = new Checkout_Function();
		cfs.Tablets();
		Thread.sleep(5000);
  }
}
