package com.brooke.utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class temp2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver dr =  new FirefoxDriver();
	  dr.get("http://www.jd.com");

	  WebElement element = dr.findElement(By.linkText("我的京东"));
	  Actions builder = new Actions(dr);
	  Action mouserOverlogin = builder.moveToElement(element).build();
	  mouserOverlogin.perform();
	  
  
	  
	  //String pagesource = dr.getPageSource();
	  //System.out.println(pagesource);
	  
	  
	  //dr.findElement(By.id("kw")).sendKeys("hello Selenium");
      
      //dr.findElement(By.id("su")).click();
      
      //dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
   
      //dr.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
