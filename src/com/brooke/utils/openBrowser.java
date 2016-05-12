package com.brooke.utils;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class openBrowser {
	private static WebDriver dr = null;
	
	
  @Test
  public void testUtils() {
	  dr.get("http://www.zhaopin.com");
	  //TakeScreenShots.shot(dr);
	  ElementUtils.getElement(dr, "id", "KeyWord_kw2", 10).sendKeys("»Ìº˛≤‚ ‘");
	  ElementUtils.getElements(dr, "className", "doSearch", 10).get(0).click();
  }
  
  @Test
  public void testUtils2() {
	  dr.get("http://sou.zhaopin.com");
	  //SelectUtils.selectByText(dr, "id", "Release-time", "ΩÒÃÏ", 10);
	  //SelectUtils.selectByValue(dr, "id", "Release-time", "3", 10);
	  //SelectUtils.selectByIndex(dr, "id", "Release-time", 4, 10);
	  SelectUtils.selectByRandom(dr, "id", "Release-time", 10);
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  //dr = BrowserUtils.openChrome();
	  dr = BrowserUtils.openFirefox();
	    
  }
  
  

}
