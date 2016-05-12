package com.brooke.utils;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestNgTest {

	private static WebDriver dr = null;
	
  @BeforeClass
  public void beforeClass() {
	  dr = BrowserUtils.openChrome();
	  
  }

  @Test
  public void test_sou() {
	  dr.get("http://www.zhaopin.com");
	  ElementUtils.getElement(dr, "id", "JobLocation", 10).clear();
	  ElementUtils.getElement(dr, "id", "JobLocation", 10).sendKeys("北京");
	  ElementUtils.getElement(dr, "id", "KeyWord_kw2", 10).sendKeys("软件测试");
	  ElementUtils.getElement(dr, "className", "doSearch", 10).click();
	  assertEquals(dr.getTitle(),"北京软件测试招聘（求职） 软件测试招聘（求职）尽在智联招聘");
	  
	  System.out.println("Title is:" + dr.getTitle());
	  
  }
  @Test
  public void test_click_shanghai() throws InterruptedException {
	  dr.get("http://www.zhaopin.com");
	  
	  ElementUtils.getElement(dr, "linkText", "上海", 10).click();
	  
	  assertEquals(dr.getCurrentUrl(),"http://www.zhaopin.com/shanghai/");
	  
	  System.out.println("Current URL is:" + dr.getCurrentUrl());
	  
  }
  
  @AfterClass
  public void afterClass() {
  }

}
