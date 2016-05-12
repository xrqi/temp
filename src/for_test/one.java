package for_test;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class one {
  @Test
  public void f() throws IOException {
	  WebDriver dr = new FirefoxDriver();
	  dr.get("http://www.baidu.com");
	  String url = dr.getCurrentUrl();
	  System.out.println(url);
	  dr.manage().window().maximize();
	  
	  
	  //String parentWindowId = dr.getWindowHandle();
	  //System.out.println(parentWindowId);
	  //System.out.println(dr.getTitle());
	  //assertEquals("百度一下", dr.getTitle());
	  
	  //dr.get("http://www.google.com");
	  WebElement searchBox = dr.findElement(By.id("kw"));
	  searchBox.sendKeys("Selenium 2");
	  searchBox.submit();
	  
	  (new WebDriverWait(dr,10)).until(new ExpectedCondition<Boolean>(){
		  public Boolean apply(WebDriver d){
			  return d.getTitle().toLowerCase().startsWith("selenium");
		  }
	  });
	  System.out.println("Page title is:" + dr.getTitle());
	  
	  dr.navigate().back();
	  
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  dr.findElement(By.id("kw")).click();
	  
	  File srcFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcFile, new File("D:/screenshot.png"));
	  
	  //dr.close();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
