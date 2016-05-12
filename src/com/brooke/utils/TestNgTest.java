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
	  ElementUtils.getElement(dr, "id", "JobLocation", 10).sendKeys("����");
	  ElementUtils.getElement(dr, "id", "KeyWord_kw2", 10).sendKeys("�������");
	  ElementUtils.getElement(dr, "className", "doSearch", 10).click();
	  assertEquals(dr.getTitle(),"�������������Ƹ����ְ�� ���������Ƹ����ְ������������Ƹ");
	  
	  System.out.println("Title is:" + dr.getTitle());
	  
  }
  @Test
  public void test_click_shanghai() throws InterruptedException {
	  dr.get("http://www.zhaopin.com");
	  
	  ElementUtils.getElement(dr, "linkText", "�Ϻ�", 10).click();
	  
	  assertEquals(dr.getCurrentUrl(),"http://www.zhaopin.com/shanghai/");
	  
	  System.out.println("Current URL is:" + dr.getCurrentUrl());
	  
  }
  
  @AfterClass
  public void afterClass() {
  }

}
