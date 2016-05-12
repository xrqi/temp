package com.brooke.utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class temp1 {
  WebDriver driver;
  @Test
  public void qqLogin() {	  
	  //System.setProperty("webdriver.chrome.driver","Files/chromedriver.exe");
	  //driver = new ChromeDriver(); //init chrome driver
	    driver = new FirefoxDriver(); //uncomment to use Firefox
	    driver.get("http://test.bangfin.com/login"); //url of website we like to test
	    //driver.manage().window().setSize(new Dimension(1600, 900)); //resize browser window
	    //login to web site
	    
	    //WebElement IframeElement = driver.findElement(By.id("login_frame"));
	    //driver.switchTo().frame(IframeElement);
	    //WebElement pLogin = driver.findElement(By.id("userName"));
	    
	    //pLogin.click();
	    
	    
	    WebElement LoginName = driver.findElement(By.id("userName"));
	    LoginName.clear();
	    LoginName.sendKeys("kane1");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    WebElement LoginPassword = driver.findElement(By.id("password"));
	    LoginPassword.clear();
	    LoginPassword.sendKeys("12345");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    WebElement baiduLogin = driver.findElement(By.xpath(".//*[@id='loginInfo']/fieldset/div[3]/button"));
	    baiduLogin.click();
	    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    WebElement dropdownUser = driver.findElement(By.xpath(".//*[@id='dropdownUser']/span"));
	    dropdownUser.click();

	    WebElement logoutUser = driver.findElement(By.xpath(".//*[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a"));
	    logoutUser.click();    
	    
	    
	    //driver.findElement(By.linkText("ÍË³ö")).click();
	    
  
  }
  @BeforeTest
  public void beforeTest() {


  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.quit();
  }

}
